import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterScanner {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\USER\\IdeaProjects\\File\\src\\file3.txt");
        try{
            PrintWriter p=new PrintWriter(f);
            Scanner sc=new Scanner(System.in);
            p.println(20);
            p.println(sc.nextLine());
           // System.out.println(p);
            p.close();
        }
        catch (FileNotFoundException e){
            System.out.println("new file must be created");
            e.getStackTrace();
        }
    }
}
