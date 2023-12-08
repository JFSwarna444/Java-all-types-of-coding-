//time complexicity = 0(n)   it is not efficient code

//public class minelesortandrotated {
//    public static void main(String[] args) {
//        int[] arr={8, 9, 4, 5, 6, 7};
//        int n= arr.length;
//        int min=arr[0];
//        for(int i=1; i<n; i++){
//            if(arr[i]<min){
//                min=arr[i];
//                break;
//            }
//        }
//        System.out.println(min);
//    }
//}


import java.util.Scanner;

//time complexicity = 0(logn)   it is more efficient code of this minimum element sorted & rotated arr
public class minelesortandrotated {
    public static int findmin(int[] arr, int low, int high){
        if(high>low){
            return arr[0];  //this case is needed when the array isn't roatated at alll
        }
        if(high==low){
            return arr[low];   //only one elelment left is present
        }
        int mid=(low+high)/2;

        //if arr[mid+1] is minimum element
        if(mid<high && arr[mid+1]<arr[mid]){
            return arr[mid+1];
        }

        //if arr[mid] itself is minimum element
        if(mid>low && arr[mid]<arr[mid-1]){
            return arr[mid];
        }

        //decide whether we need to go left half or right half
        if(arr[high]>arr[low])
            return findmin(arr,low,mid-1);
        return findmin(arr,mid+1,high);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findmin(arr,0, n-1));
    }
}