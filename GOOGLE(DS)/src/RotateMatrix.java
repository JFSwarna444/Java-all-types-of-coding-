import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][]arr = new int[n][n];
        int i,j;
        for(i=0; i< n; i++){
            for(j=0; j< n; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //transpose of matrix(row to colomun)
        for(i=0; i<n; i++){
            for(j=i; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            }
            //reverse of transpose matrix
            for(i=0; i<n; i++){
                int li=0;
                int ri=n-1;
                while(li<ri){
                    int temp=arr[i][li];
                    arr[i][li]=arr[i][ri];
                    arr[i][ri]=temp;

                    li++;
                    ri--;
                }
            }
            for(i=0; i< n; i++){
                for(j=0; j< n; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }

    }
}
