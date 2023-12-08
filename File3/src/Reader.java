//import java.io.*;
//
//class Student
//{
//    int id;
//    double mathMarks;
//    double physicsMarks;
//    double englishMarks;
//
//    public Student(int id){
//        this.id= id;
//    }
// public void updateMarks(int id, double totalmarks){
//totalmarks=totalmarks+updateMarks(id, totalmarks(i));
//     System.out.println("upadate marks");
// }
//    //You can add any method here if necessary.
//
//}
//public class Reader {
//    public static void main(String[] args) {
//        Student[] students=new Student[4];
//    try{
//    FileReader f=new FileReader("C:\\Users\\USER\\IdeaProjects\\File3\\math.txt");
//        BufferedReader br=new BufferedReader(f);
//        String s = "";
//    while(s!=null){
//        s=br.readLine();
//        int i=0;
//        String words[]=s.split(",");
//    int id=Integer.parseInt(words[0]);
//    double mathMarks=Double.parseDouble(words[1]);
//        students[i].updateMarks(id, mathMarks);
//        i++;
//
//    }
//    br.close();
//}catch (FileNotFoundException e){
//        e.printStackTrace();
//    }catch (IOException e){
//        e.printStackTrace();
//    }
//
//try{
//    FileReader f1 =new FileReader("C:\\Users\\USER\\IdeaProjects\\File3\\phy.txt");
//    BufferedReader br1=new BufferedReader(f1);
//    String s = "";
//    while(s!=null){
//        s=br1.readLine();
//        int i=0;
//        String words[]=s.split(",");
//        int id=Integer.parseInt(words[0]);
//        double physicsMarks=Double.parseDouble(words[1]);
//        students[i].updateMarks(id,physicsMarks);
//        i++;
//
//    }
//    br1.close();
//}catch (FileNotFoundException e){
//    e.printStackTrace();
//}catch (IOException e){
//    e.printStackTrace();
//}
//        try{
//            FileReader f2 =new FileReader("C:\\Users\\USER\\IdeaProjects\\File3\\eng.txt");
//            BufferedReader br2=new BufferedReader(f2);
//            String s = "";
//            while(s!=null){
//                s=br2.readLine();
//                int i=0;
//                String words[]=s.split(",");
//                int id=Integer.parseInt(words[0]);
//                double engMarks=Double.parseDouble(words[1]);
//                students[i].updateMarks(id,engMarks);
//                i++;
//
//            }
//            br2.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        try{
//            FileWriter fw= new FileWriter("C:\\Users\\USER\\IdeaProjects\\File3\\output.txt");
//            PrintWriter pw=new PrintWriter(fw);
//            for(int i=0; i< students.length; i++){
//                System.out.println(students[i].id+ " "+ students[i].mathMarks);
//                System.out.println(students[i].id+" "+ students[i].physicsMarks);
//                System.out.println( students[i].id+" "+ students[i].englishMarks);
//            }
//            pw.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
