public class Ksmallelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 4};
        int k = 2;
        for (int i=0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
            System.out.println(arr[k-1]);
        }
    }
