//import java.io.File;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//
//class Student{
//    String name;
//    int id;
//    double cgpa;
//    public Student(String name, int id, double cgpa){
//        this.name=name;
//        this.id=id;
//        this.cgpa=cgpa;
//    }
//    void printInfo(){
//        System.out.println("Name:"+name+" ID: "+id+" cgpa: "+cgpa);
//    }
//}
//public class Reader2Scanner {
//    public static void main(String[] args) {
//        Student[] students=new Student[3];
//        File f=new File("C:\\Users\\USER\\IdeaProjects\\File\\file4.txt");
//        try{
//            Scanner sc=new Scanner(f);
//            int i=0;
//            while(sc.hasNext()){
//                String name=sc.next();
//                int id=sc.nextInt();
//                double cgpa=sc.nextDouble();
//                Student s=new Student(name,id,cgpa);
//                students[i]=s;
//                i++;
//            }
//            sc.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        for(int i=0;i<3;i++){
//            students[i].printInfo();
//            System.out.println(students[i].cgpa);
//        }
//
//    }
//}
