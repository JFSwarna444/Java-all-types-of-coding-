//import java.util.Scanner;
//
//public class absolutediff {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n,i,j=0;
//        n=sc.nextInt();
//        int[] arr=new int[n];
//        for(i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        int difference=Integer.MAX_VALUE;
//        for(i=0; i<n; i++){
//            for( j=i+1; j<n; j++){
//                if(Math.abs((arr[i]-arr[j]))<difference)
//                    difference=Math.abs((arr[i]-arr[j]));
//
//            }
//        }
//        System.out.println(difference);
//                }
//    }
//}
//
//
//
//


import java.util.Scanner;

public class absolutediff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,Min;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] > arr[j ]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j ];
                    arr[j ] = temp;
                }
            }
        }

        int min=Math.abs(arr[1]-arr[0]);
        for(i=1; i<n; i++){
             Min=Math.abs(arr[i-1]-arr[i]);
            if(Min<min){
                min=Min;
            }
        }
        System.out.println(min);
        for(i=1; i<n; i++){
            if(Math.abs(arr[i-1]-arr[i])==min){
                System.out.println(arr[i-1]+" "+arr[i]);
                break;
           }
        }
    }
}