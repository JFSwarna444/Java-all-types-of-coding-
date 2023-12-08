import java.io.*;

 class Student {
    int id;
    public double creditCompleted;
    public double cgpa;

    public Student(int id, double creditCompleted, double cgpa) {
        this.id = id;
        this.creditCompleted =0 ;
        this.cgpa = 0.0;
    }

    public void updateCgpa(double newCredit, double newGpa) {
        cgpa = (cgpa * creditCompleted + newGpa * newCredit) / (creditCompleted + newCredit);
        creditCompleted = creditCompleted + newCredit;
    }

}
 public class Reader{
     public static void main(String[] args) {
         Student[] students=new Student[3];
         try {
             FileReader reader = new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term1.txt");
             //  FileReader reader1 =new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term2.txt");
             // FileWriter writer =new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");
             BufferedReader r = new BufferedReader(reader);
             //     BufferedReader r1=new BufferedReader(reader1);
             //   BufferedWriter r1=new BufferedWriter(writer);
             String s = "";
             while (s != null) {
                 s = r.readLine();
                 int i = 0;
                 String words[] = s.split(" ");
                 // for(i=0; i<students.length; i++){   int[] myNumberCollection = {1, 2, 56, 57, 23};   public void updateCgpa(double newCredit,
                 //                     double[] newGpa)
                 //  Student students=new Student();    s[0] = new Student();   s[0].setName("John");  int[] age = new int[5]; age[0] = 25;
                int[] id=new int[0];
                 Integer.parseInt(words[0]);
                double[] credit=new double[1];
                  Integer.parseInt(words[1]);
                  double[] gpa=new double[2];
                  Double.parseDouble(words[2]);
               //  students[i]=new Student(id);
              //   students[i].updateCgpa(credit, gpa);
                 i++;
             }
//                 int id=Integer.parseInt(words[0]);
//                 int creditCompleted=Integer.parseInt(words[1]);
//                 double cgpa=Double.parseDouble(words[2]);
             // students[i]=new Student(id,creditCompleted,cgpa);

             //  i++;
         //}
             r.close();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }
//         for(int i=0; i<3; i++){
//             students[i].updateCgpa(13,3.77);
//             System.out.println(students[i].cgpa);
//         }
         try{

             FileReader reader1 =new FileReader("C:\\Users\\USER\\IdeaProjects\\File\\term2.txt");
             // FileWriter writer =new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");

             BufferedReader r1=new BufferedReader(reader1);
             //   BufferedWriter r1=new BufferedWriter(writer);
             String s2="";
             while(s2!=null){
                 s2=r1.readLine();
                 int i=0;
                 String words[]= s2.split(" ");
//                 for(i=0; i< students.length; i++){
                 int id=Integer.parseInt(words[0]);
                 int creditCompleted=Integer.parseInt(words[1]);
                 double cgpa=Double.parseDouble(words[2]);
                     students[i].updateCgpa(creditCompleted,cgpa);
                     i++;
                 }
//                 int id=Integer.parseInt(words[0]);
//                 int creditCompleted=Integer.parseInt(words[1]);
//                 double cgpa=Double.parseDouble(words[2]);
//                 students[i]=new Student(id,creditCompleted,cgpa);
//
//                 i++;
           //  }
             r1.close();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }
         try{
             FileWriter fwrite=new FileWriter("C:\\Users\\USER\\IdeaProjects\\File\\output.txt");
             PrintWriter pw=new PrintWriter(fwrite);
            for(int i=0; i< students.length; i++){
                System.out.println(students[i].id+ " "+ students[i].creditCompleted+" "+ students[i].cgpa);
            }
            pw.close();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }
     }
}
