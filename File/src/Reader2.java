import java.io.*;
import java.util.Scanner;


class StudentP {
    int id;
    public int creditCompleted;
    public double cgpa;

    public StudentP(int id, int creditCompleted, double cgpa) {
        this.id = id;
        this.creditCompleted =0 ;
        this.cgpa = 0.0;
    }

    public void updateCgpa(int newCredit, double newGpa) {
        cgpa = (cgpa * creditCompleted + newGpa * newCredit) / (creditCompleted + newCredit);
        creditCompleted = creditCompleted + newCredit;
    }

}
public class Reader2{
    public static void main(String[] args) {
        Student[] students = new Student[3];
        try {
            FileReader reader = new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term1.txt");
            //  FileReader reader1 =new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term2.txt");
            // FileWriter writer =new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");
            //   BufferedReader r = new BufferedReader(reader);
            //     BufferedReader r1=new BufferedReader(reader1);
            //   BufferedWriter r1=new BufferedWriter(writer);
            //  String s = "";
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                int i = 0;
                String words[] = s.split(" ");
                // for(i=0; i<students.length; i++){
                //  Student students=new Student();
                int id = Integer.parseInt(words[0]);

                int creditCompleted = Integer.parseInt(words[1]);
                double cgpa = Double.parseDouble(words[2]);
                students[i].updateCgpa(creditCompleted, cgpa);
            }
//                 int id=Integer.parseInt(words[0]);
//                 int creditCompleted=Integer.parseInt(words[1]);
//                 double cgpa=Double.parseDouble(words[2]);
            // students[i]=new Student(id,creditCompleted,cgpa);

            //  i++;
            //}
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//         for(int i=0; i<3; i++){
//             students[i].updateCgpa(13,3.77);
//             System.out.println(students[i].cgpa);
//         }
            try {

                FileReader reader1 = new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term2.txt");
                // FileWriter writer =new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");

                //  BufferedReader r1=new BufferedReader(reader1);
                //   BufferedWriter r1=new BufferedWriter(writer);
                //String s2="";
                Scanner sc = new Scanner(reader1);
                while (sc.hasNext()) {
                    String s = sc.nextLine();

//                s2=r1.readLine();
                    int i = 0;
                    String words[] = s.split("");
//                 for(i=0; i< students.length; i++){
                    int id = Integer.parseInt(words[0]);
                    int credit = Integer.parseInt(words[1]);
                    double gpa = Double.parseDouble(words[2]);
                    students[i].updateCgpa(credit, gpa);
                }
//                 int id=Integer.parseInt(words[0]);
//                 int creditCompleted=Integer.parseInt(words[1]);
//                 double cgpa=Double.parseDouble(words[2]);
//                 students[i]=new Student(id,creditCompleted,cgpa);
//
//                 i++;
                //  }
                sc.close();
            } catch (FileNotFoundException n) {
                n.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
                try {
                    FileWriter fwrite = new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");
                    PrintWriter pw = new PrintWriter(fwrite);
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i].id + " " + students[i].creditCompleted + " " + students[i].cgpa);
                    }
                    pw.close();
                } catch (FileNotFoundException m) {
                    m.printStackTrace();
        }catch (IOException p){
            p.printStackTrace();
        }
                }
            }
        }
    }