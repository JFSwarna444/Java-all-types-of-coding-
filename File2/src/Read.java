import java.io.*;
import java.util.Locale;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C:\\Users\\USER\\IdeaProjects\\File2\\input.txt");
            BufferedReader br = new BufferedReader(f);
            FileWriter f1 = new FileWriter("C:\\Users\\USER\\IdeaProjects\\File2\\output.txt");
            BufferedWriter fw = new BufferedWriter(f1);
            String s = br.readLine();
            while (s != null) {
                fw.write(s);
                s=s.toLowerCase();
                int vow=0, dig=0,charac=0,specialcharac=0;
                for(int i=0; i<s.length(); i++){
                    char ch=s.charAt(i);

                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                        vow++;
                    }
                    else if(ch>='0' && ch<='9'){
                        dig++;
                    }
                    else {
                        specialcharac++;
                    }
                }
//                fw.write(s);
//                fw.newLine();
//               s= br.readLine();
                System.out.println(charac);
                System.out.println(vow);
                System.out.println(dig);
                System.out.println(specialcharac);
            }
            fw.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
