import java.util.Scanner;

public class RemDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k;
        n= sc.nextInt();
        int[] arr=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    for(k=j; k<n; k++) {
                        arr[k] = arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
