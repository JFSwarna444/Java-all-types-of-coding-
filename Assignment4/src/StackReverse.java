import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    static Stack<Character>s = new Stack<>();
    static void new_stack(char a){
        if(s.empty()){
            s.push(a);
        }
        else{
            char p= s.peek();
            s.pop();
             new_stack(a);
             s.push(p);
        }
    }
static void reverse(){
//    int n=0;
//    if(n>-1){

    if(s.size()>0){
        char a = s.peek();
         s.pop();
        reverse();
        new_stack(a);
    }
        }
        public static void main(String[] args) {

      //      Stack<Integer> s= new Stack<>();
       // int top=-1, n=0,size=4;
        Scanner sc =new Scanner(System.in);
       //     int size= sc.nextInt();

         //  for(int i=0; i<size; i++) {
         //      s.push(sc.nextInt());
       //    }
           //   s.push(sc.nextInt());
            s.push('1');
            s.push('2');
            s.push('3');
            s.push('4');

           reverse();
        System.out.println(s);
    }
}
