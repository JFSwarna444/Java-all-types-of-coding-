import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//public class DescendingS {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        Integer[] arr= new Integer[n];
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        for(int i=0; i<n; i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//}



public class DescendingS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                int temp=0;
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}