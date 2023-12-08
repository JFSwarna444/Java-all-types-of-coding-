import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner("This is oop class");
        String t=sc.next();
        System.out.println(t);   //This
        String t1 =sc.nextLine();
        System.out.println(t1);
        Scanner s=new Scanner("3 is class");
        int r=s.nextInt();
        System.out.println(r);
        String p=s.next();
        System.out.println(p);
        String h=s.nextLine();
        System.out.println(h);
    }
}