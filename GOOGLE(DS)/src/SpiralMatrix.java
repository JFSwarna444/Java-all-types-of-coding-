//import java.util.Scanner;
//
//public class SpiralMatrix {
//    public static void spiralmatrix(int m,int n, int[][] arr) {
//        int row = m;
//        int col = n;
//        int top = 0, bottom = row - 1, left = 0, right = col - 1;
//
//        int dir = 1;
//        while (left <= right && top <= bottom) {
//            if (dir == 1) {
//                for (int i = left; i <= right; i++) {
//                    System.out.print(arr[top][i] + " ");
//                }
//                top++;
//                dir=2;
//            }
//            if(dir==2){
//                for(int i=top; i<=bottom; i++){
//                    System.out.print(arr[i][right]+" ");
//                }
//                right--;
//                dir=3;
//            }
//            if(dir==3){
//                for(int i=right ; i>=left; i--){
//                    System.out.print(arr[bottom][i]+" ");
//                }
//                bottom--;
//                dir=4;
//            }
//            if(dir==4){
//                for (int i=bottom; i>=top; i--){
//                    System.out.print(arr[i][left]+" ");
//                }
//                left++;
//                dir=1;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//        int m,n,i,j;
//        m= scn.nextInt();
//        n=scn.nextInt();
//        int[][] arr= new int[m][n];
//        for(i=0; i<m; i++){
//            for(j=0; j<n; j++){
//                arr[i][j]=scn.nextInt();
//            }
//        }
//        spiralmatrix(m,n,arr);
//    }
//}





public class SpiralMatrix {
//    public static void partition(int[] A, int i,int j){
//      //  int i, j;
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }
    public static void main(String[] args) {
        int A[] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int n =A.length;
        System.out.println(n);

        for ( int i = 0; i < n; i++) {
           // printf("%d ", A[i]);
            System.out.print(A[i]+" ");
        }
    }
}