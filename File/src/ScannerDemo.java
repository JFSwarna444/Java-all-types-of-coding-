//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

/*public class ScannerDemo {
//    public static void main(String[] args) {
//        File f=new File("C:\\Users\\USER\\IdeaProjects\\File\\src\\file1.txt");
//        try{
//            Scanner sc=new Scanner(f);
//            int t=sc.nextInt();
//            System.out.println(t);
//            String p =sc.next();
//            System.out.println(p);
//        }catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
//    }
}*/

//using loop
//import java.io.File;
////import java.io.FileNotFoundException;
//import java.util.Scanner;
//public class ScannerDemo {
//    public static void main(String[] args) {
//        File f = new File("C:\\Users\\USER\\IdeaProjects\\File\\src\\file1.txt");
//        try {
//            Scanner sc = new Scanner(f);
//            while (sc.hasNext()) {
//                String token = sc.next();
//                System.out.println(token);
//            }
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//    }
//}

//using loop for sum
import java.io.File;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\USER\\IdeaProjects\\File\\src\\file1.txt");
        try {
            Scanner sc = new Scanner(f);
            int sum = 0;
            while (sc.hasNext()) {
                String token = sc.next();
                try {
                    int a = Integer.parseInt(token);
                    sum += a;
                } catch (NumberFormatException e) {
                    System.out.println("you don't give string which isn't convert into integer");
                }
            }
            System.out.println(sum);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
