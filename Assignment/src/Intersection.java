import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {

        int i = 0, j = 0;
        int[] arr1 = {21,22, 34,35,41};
        int[] arr2 = {11,21,34,45,61};

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }
}


