import java.util.Scanner;

public class RemoveDuplicateSortedArr {
    public static int removeduplicate(int[] arr, int n){
        if(n==0 || n==1){
            return n;
        }
        int j=0,i;
        int[] temp= new int[n];
        for(i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
              //  j++;
            }
        }
        temp[j++]=arr[n-1];
//        for(i=0; i<j; i++){
//            arr[i]=temp[i];
//        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int l=removeduplicate(arr,n);
        System.out.println(l);
        for(int i=0; i<l; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
