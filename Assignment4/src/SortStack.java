import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    static void Stack_Sort(Stack<Integer> s,int p){
        if(s.isEmpty() || p>s.peek()){
            s.push(p);
        //    return ;
        }
        else{
            int z= s.pop();
            Stack_Sort(s,p);
            s.push(z);
        }
    }
    static void sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int p= s.pop();
            sort(s);
            Stack_Sort(s,p);
        }
    }
    static void printstacksort(Stack<Integer> s){
        ListIterator<Integer> sc= s.listIterator();
      //  Scanner sc= new Scanner(System.in);
        while(sc.hasNext())
            sc.next();
       // while(sc.hasNext())
        while (sc.hasPrevious())
            System.out.println(sc.hasPrevious()+" ");
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(30);
        s.push(-9);
        s.push(18);
        s.push(13);
        s.push(-2);
        printstacksort(s);
        System.out.println();
        sort(s);

    }
}
