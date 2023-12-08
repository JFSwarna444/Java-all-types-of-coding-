import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        n1=(n1>0) ? n1:-n1;
//        n2=(n2>0) ? n2:-n2;
        while (n1 != n2) {
//            if(n1>n2){
//                n1=n1-n2;
//            }
//            else{
//                n2=n2-n1;
//            }
//        }
//        System.out.println(n1);
            if (n1 < n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if(n2==0)
                System.out.println(n1);
            else{
                System.out.println(n1%n2);
                break;
            }
        }
    }
}
