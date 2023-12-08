import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Student2{
    String name;
    int Id;
    double cgpa;
    public Student2(String name, int Id, double cgpa){
        this.name=name;
        this.Id=Id;
        this.cgpa=cgpa;
    }
}
public class Reader2Split {
    public static void main(String[] args) {
        Student2[] students=new Student2[3];
        File f=new File("C:\\Users\\USER\\IdeaProjects\\File\\file4.txt");
        try{
            Scanner sc=new Scanner(f);
            int i=0;
            while(sc.hasNext()){
                String s1=sc.nextLine();
                String[] words=s1.split(" ");
                String name=words[0];
                int id=Integer.parseInt(words[1]);
                double cgpa=Double.parseDouble(words[2]);
                Student2 s=new Student2(name,id,cgpa);
                students[i]=s;
                i++;
            }
            sc.close();
        }catch(FileNotFoundException n){
            n.getStackTrace();
        }
        for(int i=0; i<3; i++){
            System.out.println(students[i].cgpa);
        }
    }
}
