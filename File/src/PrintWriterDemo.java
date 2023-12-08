import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\USER\\IdeaProjects\\File\\src\\file2.txt");
        try{
            PrintWriter pw=new PrintWriter(f);
            System.out.println();
            pw.println(20);
            pw.println("bcd");
            pw.close();
        }catch (Exception e){
            System.out.println("wrong");
        }
    }
}
