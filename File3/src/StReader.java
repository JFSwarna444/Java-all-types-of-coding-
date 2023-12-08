import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    public int id;
    public String name;
    private double physics_marks;
    private double chemistry_marks;
    private double math_marks;
    public double totalMarks;


    //    double get1(){
//      return physics_marks;
//    }
//    void set(double a){
//        this.physics_marks=a;
//    }
//    double get(){
//        return chemistry_marks;
//    }
//    double get2(){
//        return math_marks;
//    }
    public Student(int id, String name, double physics_marks, double chemistry_marks, double math_marks) {
        this.id = id;
        this.name = name;
        this.physics_marks = physics_marks;
        this.chemistry_marks = chemistry_marks;
        this.math_marks = math_marks;
        this.totalMarks = physics_marks + chemistry_marks + math_marks;
    }


    void printinfo(String name, int id, double totalMarks) {
        System.out.println("name:" + name + "id:" + id + "totalMarks:" + totalMarks);
    }
}
class sortbyStudents implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.totalMarks > s2.totalMarks) {
            return 1;
        } else if (s1.totalMarks < s2.totalMarks) {
            return -1;
        } else if (s1.totalMarks == s2.totalMarks) {
            return 0;
        }

        return 1;
    }
}
public class StReader {
    public static void main(String[] args) {
        int nStudent = 0;
        Student[] st = new Student[3];

        try {
            FileReader f = new FileReader("C:\\Users\\USER\\IdeaProjects\\File3\\src\\Input.txt");
            BufferedReader r = new BufferedReader(f);
            String s;
            s = r.readLine();
            int p = Integer.parseInt(s);
            ArrayList<Student> l = new ArrayList<Student>(p);
            while (( s= r.readLine())!= null) {

               int i = 0;
//                if (nStudent <= i) {
//                    break;
//                }
                String[] words = s.split(" ");
                System.out.println(s);
                int id = Integer.parseInt(words[0]);
                String name = words[1];
                double physics_marks = Double.parseDouble(words[2]);
                double chemistry_marks = Double.parseDouble(words[3]);
                double math_marks = Double.parseDouble(words[4]);
               // double totalMarks = Double.parseDouble(words[5]);
                l.add(new Student(id, name, physics_marks, chemistry_marks, math_marks));
               // st[i].printinfo(name, id, totalMarks);
            }

            r.close();
            Collections.sort(l, new sortbyStudents());

            FileWriter fw = new FileWriter("C:\\Users\\USER\\IdeaProjects\\File3\\output.txt");
            BufferedWriter w = new BufferedWriter(fw);
            int i;
            for (i = 0; i < p; i++)
                w.write("student name:" + l.get(i).name + "id:" + l.get(i).id + "TotalMarks:" + l.get(i).totalMarks);

            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
