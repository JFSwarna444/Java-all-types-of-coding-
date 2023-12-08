import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Filedemo {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
      //  try{
            FileReader fr=new FileReader("C:\\Users\\USER\\IdeaProjects\\GUI\\s1.txt");
            BufferedReader r=new BufferedReader(fr);
            FileWriter fw=new FileWriter("C:\\Users\\USER\\IdeaProjects\\GUI\\s2.txt");
            BufferedWriter w=new BufferedWriter(fw);
            String s= r.readLine();
            w.write(s);
            w.newLine();
            w.newLine();
            s=r.readLine();
            w.write(s);
            w.newLine();
            w.newLine();
        s=r.readLine();
        w.write(s);
        w.newLine();
        w.newLine();
        s=r.readLine();
        w.write(s);
        w.newLine();
       // w.newLine();
        s=r.readLine();
        w.write(s);
        w.close();

//            while(s!=null){
//                w.write(s);
//                w.newLine();
//                w.newLine();
//                s=r.readLine();
//                int i=0;
//                if (Integer.parseInt(sc.nextLine()) != (s.length() - 1))
//                // continue;
//                //  }
//                {
//                } else {
//                    System.out.println();
//                }
//                System.out.println();
//                w.write(s.length() - 1);
//
//            }
//        w.close();


//                Scanner sc1=new Scanner(System.in);
//                int i=1;
//                while(sc1.hasNext()){
//                    String token=sc1.nextLine();
//                    i--;
            //    for(int i=1; i<s.length()-1; i--){
              //      fw.write(s);
              //      System.out.println();
                   // System.out.println();
              //      s=r.readLine();
               // }
            }
//            fr.close();
//            fw.close();
        }
//        catch(Exception e){
//            e.getStackTrace();
//        }
//    }
//}
