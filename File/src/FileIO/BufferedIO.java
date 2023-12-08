package FileIO;

//import java.io.*;
//
//public class BufferedIO {
//    public static void main(String[] args) throws Exception {
//        FileReader reader=new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\src\\FileIO\\file1.txt");
//        BufferedReader r=new BufferedReader(reader);
//        FileWriter writer =new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\src\\FileIO\\file2.txt");
//        BufferedWriter w=new BufferedWriter(writer);
//
//        String s=r.readLine();
//       w.write(s);
//       w.newLine();
//       w.close();
//    }
//}


//using loop
import java.io.*;

public class BufferedIO {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\src\\FileIO\\file1.txt");
        BufferedReader r = new BufferedReader(reader);
        FileWriter writer = new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\src\\FileIO\\file2.txt",true);
        BufferedWriter w = new BufferedWriter(writer);

        String s = r.readLine();
        while (s != null) {
            w.write(s);
            w.newLine();
            s = r.readLine();
        }
        w.close();
    }
}