import java.util.Arrays;

public class WaveArray {
    public static void swap(int[] arr, int n){
        //Arrays.sort(arr);
        /////bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //comparing neighbours or swap adjacent elements
        for(int i=0; i<n-1; i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={5, 2, 9, 3, 2};
        int i;
        int n= arr.length;
        swap(arr,n);

        for(i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
