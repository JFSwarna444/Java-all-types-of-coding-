import java.util.Scanner;

public class MinCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
//        int res=Integer.MAX_VALUE;
        int sum=100;
        for(i=1; i<=sum; i++){

        }
        n=sc.nextInt();
        int[] coin=new int[n];
        for(i=0; i<n; i++){
            coin[i]=sc.nextInt();
        }
        for(i=0; i<n; i++){
            int count=0;
            while (sum>=coin[i]){
                sum=sum-coin[i];
              //  res[count]=coin[i];
            }
        }
    }
}
