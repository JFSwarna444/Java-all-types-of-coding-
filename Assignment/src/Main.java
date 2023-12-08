import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
            }
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}


