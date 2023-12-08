
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employer{
    String name;
    int age;
    int salary;
    public Employer(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
    void printInfo(){
        System.out.println("Name: "+name+" Age:"+age+" Salary:"+salary);
    }

}
class SortBySalary implements Comparator<Employer>{
    @Override
    public int compare(Employer o1, Employer o2) {  //returns 1 if the objects need to swap, else -1
        if(o1.salary>o2.salary){
            return 1; //we need to swap
        }
        return -1;
    }
}
class SortByAge implements Comparator<Employer>{
    @Override
    public int compare(Employer o1, Employer o2) {
        if(o2.age>o1.age){
            return 1;
        }
        return -1;
    }
}
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employer> l1 = new ArrayList<Employer>();
        l1.add(new Employer("Asif",25,18000));
        l1.add(new Employer("Arif",25,20000));
        l1.add(new Employer("Rakib",32,13234));

        for(int i=0;i<l1.size();i++){
            l1.get(i).printInfo();
        }
        //Comparator Class
        l1.sort(new SortByAge());


//        System.out.println("After Sorting");
//        for(int i=0;i<l1.size();i++){
//            l1.get(i).printInfo();
//        }
//        System.out.println();

        l1.sort(new SortBySalary());
        for(int i=0;i<l1.size();i++){
            l1.get(i).printInfo();
        }
        System.out.println();
    }
}