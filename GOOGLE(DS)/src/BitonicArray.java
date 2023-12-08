import java.util.Scanner;

public class BitonicArray {
    public static int findbitonicpoint(int[] arr, int n, int l, int r){
        int mid, bitonicpoint=0;
        mid=(r+l)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            return mid;      //this mid means bitonic or peak point
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            bitonicpoint= findbitonicpoint(arr,n,mid,r);
        }
        else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
            bitonicpoint= findbitonicpoint(arr,n,l,mid);
        }
        return bitonicpoint;    //if first mid can't find then go loop (else if) and return bitonic or peak point
    }

   public static int searchbitonicarr(int[] arr,int n, int key, int index){
        if(key>arr[index]){
            return -1;
        }
        else if(key==arr[index]){
            return index;
        }
        else{
            int temp= ascendingbinarysearch(arr,0,index-1,key);    //left side ascending order
            if(temp!=-1){
                return temp;
            }

            return descendingbinarysearch(arr,index+1,n-1, key);   //right side descending order
        }
    }

    public static int ascendingbinarysearch(int[] arr,int low, int high,int key){
        while (low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int descendingbinarysearch(int[] arr, int low, int high, int key ){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                low= mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0; i<n; i++){
         arr[i]= sc.nextInt();
     }
     int key= sc.nextInt();
     int r,l,index,x;
     l=0;
     r=n-1;

     index=findbitonicpoint(arr,n,l,r);
     x=searchbitonicarr(arr,n,key,index);

     if(x==-1) System.out.println("element not found"+x);

     else{
         System.out.println("element found "+x);
     }
        }

    }

