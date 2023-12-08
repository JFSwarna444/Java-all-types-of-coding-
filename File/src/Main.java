//package com.company;

import java.io.*;

class MStudent
{
    int id;
    public double creditCompleted;
    public double cgpa;

    public MStudent(int id){
        this.id= id;
        this.creditCompleted=0;
        this.cgpa=0.0;
    }
    public void updateCgpa(double newCredit, double newGpa){
        cgpa= (cgpa*creditCompleted + newGpa*newCredit)/(creditCompleted+newCredit);
        creditCompleted= creditCompleted+newCredit;
    }
}
public class Main {

    public static void main(String[] args) {
        Student[] students=new Student[3];

        //Read file1, create student object with ID for each index of the array, update cgpa and credit for each student.
        try{
            FileReader fr=new FileReader("term1.txt");
            BufferedReader br=new BufferedReader(fr);

            int i=0;
            String s = "";
            while((s=br.readLine())!=null){
                String[] parts=s.split(" ");
                int ID=Integer.parseInt(parts[0]);
                double credit= Double.parseDouble(parts[1]);
                double gpa=Double.parseDouble(parts[2]);
               // students[i]=new Student(ID);
                students[i].updateCgpa(credit,gpa);
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Read file2,You will not create new student object in the array, because student object is already created
        //Just read the credit and gpa, then update each student's cgpa and creditCompleted
        try{
            FileReader fr=new FileReader("term2.txt");
            BufferedReader br=new BufferedReader(fr);
            int i=0;
            String s = "";
            while((s=br.readLine())!=null){
                String[] parts=s.split(" ");
                int ID=Integer.parseInt(parts[0]);
                double credit= Double.parseDouble(parts[1]);
                double gpa=Double.parseDouble(parts[2]);
                students[i].updateCgpa(credit,gpa);
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fw=new FileWriter("output.txt");
            PrintWriter pw=new PrintWriter(fw);

            for(int i=0;i<students.length;i++){
                pw.println(students[i].id+" "+students[i].creditCompleted+" "+students[i].cgpa);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
