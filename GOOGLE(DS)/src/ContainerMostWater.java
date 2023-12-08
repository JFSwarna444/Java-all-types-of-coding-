import java.util.Scanner;
////optimal solution (this is nor Brute force solution)

public class ContainerMostWater {
    public static int  contaiwater(int[] arr){
        int i=0;
        int j= arr.length-1;
        int water=0;

        while(i<j){
            int width= j-i;
            int height=Math.min(arr[i],arr[j]);
            water=Math.max(water,width*height);

            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(contaiwater(arr));
    }
}
