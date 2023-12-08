import java.util.Scanner;

public class Arrreverese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n= sc.nextInt();
        int[] arr=new int[n];
        for(i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
