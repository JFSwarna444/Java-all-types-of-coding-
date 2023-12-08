//import java.io.*;
//import java.util.*;
//class File {
//    public static void main(String arg[]) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Provide source file name :");
//        String sfile = sc.next();
//        System.out.print("Provide destination file name :");
//        String dfile = sc.next();
//        FileReader fin = new FileReader(sfile);
//        FileWriter fout = new FileWriter(dfile, true);
//        int c;
//        while ((c = fin.read()) != -1) {
//            fout.write(c);
//        }
//        System.out.println("Copy finish...");
//        fin.close();
//        fout.close();
//    }
//}


import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class File {
    public static void main(String[] args){
//        FileInputStream fr =new FileInputStream(s1);
//        FileOutputStream fw;
        try {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

           FileReader fr = new FileReader("C:\\Users\\USER\\IdeaProjects\\GUI\\s1.txt");
            FileWriter fw = new FileWriter("C:\\Users\\USER\\IdeaProjects\\GUI\\s2.txt",true);
            int p;
            p = fr.read();
            if (p != -1) {
                fw.write(p);
                fw.append(System.lineSeparator());
//                System.out.println();
            }
//            else {
//                System.out.println("can't wr/ite anything");
//           }
            fr.close();
           fw.close();
       }
        //finally {
//            if (fr !=null){
//                fr.close();
//            }
//        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}