import java.util.Scanner;

public class Divisable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                  arr[i] = -1;
            }

        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}