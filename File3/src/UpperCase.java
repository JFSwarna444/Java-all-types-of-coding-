
import java.io.*;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) throws FileNotFoundException {
//        String str;
//        Scanner sc=new Scanner(System.in);
     //   str=sc.nextLine();
        //File f=new File("C:\\Users\\USER\\IdeaProjects\\File3\\src\\s1.txt");
    //    Scanner sc1=new Scanner(f);
        try {
            File f=new File("C:\\Users\\USER\\IdeaProjects\\File3\\src\\s1.txt");
            Scanner sc1=new Scanner(f);
        //    PrintWriter w=new PrintWriter("C:\\Users\\USER\\IdeaProjects\\File3\\src\\s2.txt");
            int count=0;
            while(sc1.hasNext()){
                String token=sc1.nextLine();
                for(int i=0; i< token.length(); i++){
                    if(token.charAt(i)>='A' && token.charAt(i)<='Z' ||token.charAt(i)>='a'&&token.charAt(i)<='z'){
                        count++;
                    }

                }
            //    w.write(count);
            }
            sc1.close();
            System.out.println(count);
//            w.write(count++);
         //   w.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
