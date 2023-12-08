import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n,i;
//        n=sc.nextInt();
//        int[] arr=new int[n];
//        for(i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
        int i;
        int[] arr = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        //quickSort(arr, 0, 9);
        System.out.println("\n The sorted array is: \n");
        for (i = 0; i < 10; i++)
            System.out.println(arr[i]);

//        public static void quickSort (arr[i],int f, int l)
//        {
             int l,f;
            int temp;
            l = sc.nextInt();
            f = sc.nextInt();
            if (l > f) {
                i = f + 1;
                int j = l;
                while (i <= j) {
                    while ((i <= l) && arr[f] > arr[i]) {
                        i = i + 1;
                    }
                    while ((j >= f) && arr[f] < arr[j]) {
                        j = j - 1;
                    }
                    if (i > j)
                        break;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i = i + 1;
                    j = j + 1;
                }
                temp = arr[f];
                arr[f] = arr[j];
                arr[j] = temp;
            }
//          void  quickSort(arr[i], f, j - 1);
//            quickSort(arr, j + 1, l);
        }
    }
//    static void quickSort(int a[], int beg, int end)
//    {
//
//        int loc;
//        if(beg<end)
//        {
//            loc = partition(a, beg, end);
//            quickSort(a, beg, loc-1);
//            quickSort(a, loc+1, end);
//        }
//    }
//}

//    }
//}
