import java.util.Scanner;

public class MaxSumArray {
    public static int solution(int[] arr){
        int csum=0;
        int osum=0;
        for(int i=1; i< arr.length; i++){           /// input 7
                                                    ///2 -4 1 9 -6 7 -3
                                                     //output 11
            if(csum>0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }
            if(csum>osum){
                osum=csum;
            }
        }
        return osum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
