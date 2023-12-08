import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class longestRead {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\USER\\IdeaProjects\\File2\\input2.txt");
        try{
            Scanner sc=new Scanner(f);
            String longestword="";
            while(sc.hasNext()){
                String token=sc.next();
                if(token.length()>longestword.length()){
                    token=longestword;
                }
            }
            System.out.println(longestword);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
