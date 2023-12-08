import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {

    static void SWAP(int arr[],int i,int j) {

        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

        static void BUBBLE_SORT(int[] arr) {
            int i, j;
            int n = arr.length;
            for (i = 0; i < n - 1; i++) {
                for (j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        SWAP(arr, i, j);

                    }
                }
            }
        }
    public static void main(String[] args) throws IOException {


        ThreadLocalRandom rd=  ThreadLocalRandom.current();
        int n= 500;
        System.out.println(n);
        int[] arr=new int[n];
                int i;
               for( i=0; i<n; i++){
                   arr[i]= rd.nextInt(-249,250);
               }
        FileWriter w = new FileWriter("C:\\Users\\USER\\IdeaProjects\\Assignment\\src\\in.txt");
         for(i=0; i<n; i++){
             w.write(arr[i]+" ");
         }
         w.close();

        BUBBLE_SORT(arr);
         FileWriter out=new FileWriter("C:\\Users\\USER\\IdeaProjects\\Assignment\\src\\out.txt");
         for(i=0; i<n; i++){
             out.write(arr[i]);
         }
         out.close();

    }
}
