import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First File Name: ");
        String input = scan.next();
        System.out.print("Enter Second File Name: ");
        String out = scan.next();
        File file = new File("C:\\Users\\USER\\IdeaProjects\\GUI\\s1.txt");
        Scanner sc = new Scanner(file);
        try {
            FileWriter fw = new FileWriter("C:\\Users\\USER\\IdeaProjects\\GUI\\s2.txt");
            while (sc.hasNext()) {
                String in = sc.nextLine();
                if (in.isBlank()) {
                    fw.write("\r\n");
                    continue;
                }
                fw.write(in);
                if (!sc.hasNext()) {
                    continue;
                }
                fw.write("\r\n");
                fw.write("");
                fw.write("\r\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}