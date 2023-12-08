import java.io.*;
import java.util.Random;
import java.util.UUID;

public class InsertionSort {
    static void REPLACEMENT_SORT(String s) {

        char[] arr=s.toCharArray();
            int j,i;
            int n=s.length();
            for (i = 1; i <= n-1; i++) {
               char key = arr[i];
                j = i - 1;
                while (j >= 0 && arr[i] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] =  key;

            }
            for(i=0; i<n; i++) {
                System.out.println(arr);
                break;
            }
   }

    public static void main(String[] args) throws IOException {
        Random rd=new Random();
        int n= 1000;
        System.out.println(n);
        int i;
        String s= UUID.randomUUID().toString();

        FileWriter w= new FileWriter("C:\\Users\\USER\\IdeaProjects\\Assignment\\src\\Inserin.txt");
        for(i=0; i<n; i++){
            w.write(s+" ");
        }
        w.close();
        REPLACEMENT_SORT(s);
    }
}
