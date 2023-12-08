//import java.io.*;
//
//class Student3{
//    String name;
//    int Id;
//    double cgpa;
//    public Student3(String name, int Id, double cgpa){
//        this.name=name;
//        this.Id=Id;
//        this.cgpa=cgpa;
//    }
//}
//public class Reader3 {
//    public static void main(String[] args) {
//        Student[] students=new Student[3];
//        try{
//            FileReader fileReader=new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\file4.txt");
//            BufferedReader reader=new BufferedReader(fileReader);
//            String s= reader.readLine();
//            int i=0;
//            while(s!=null){
//                String[] parts=s.split(" ");
//                String name=parts[0];
//                int Id=Integer.parseInt(parts[1]);
//                double cgpa=Double.parseDouble(parts[2]);
//                Student s2=new Student(name, Id, cgpa);
//                students[i]=s2;
//                i++;
//            }
//            reader.close();
//        }catch (FileNotFoundException n){
//            n.printStackTrace();
//        }catch (IOException n){
//            n.printStackTrace();
//        }
//        for(int i=0; i<3; i++){
//            System.out.println(students[i].cgpa);
//        }
//    }
//}
