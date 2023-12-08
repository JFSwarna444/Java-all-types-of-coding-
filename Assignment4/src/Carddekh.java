import java.util.Scanner;

public class Carddekh {
    public static void main(String[] args) {

        int maxsize=52;
        int queue[]=new int[maxsize];
        int n,front,rear;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while(n==1 && n!=0){
            for(int i=0; i<n; i++)
                queue[i]=i+1;
            front=0;
            rear=n;
            System.out.println("discarded cards:");
            while(front<rear-1){
                if(front==rear-2){
                    System.out.printf("%d ",queue[front]);

                }
                else{
                    System.out.printf("%d ,",queue[front]);

                }
                front++;
                queue[rear]=queue[front];
                front++;
                rear++;
                System.out.println("remaining card:");
                System.out.printf("%d ",queue[front]);
            }
        }
    }
}
