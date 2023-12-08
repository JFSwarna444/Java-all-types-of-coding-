//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//
//public class StackusingTwoQueues {
//    private static int[] q3;
//
//   // private static int[] q4;
//    // public static class Queue {
//        // Stack<Integer> q3 = new Stack<Integer>();
//       // Stack<Integer> q4 = new Stack<Integer>();
//   Queue<Integer> q1 = new LinkedList<Integer>();
//    Queue<Integer> q2 = new LinkedList<Integer>();
//        static int data,rear=0, front=0,n=100;
//        static boolean enqueue(int data){
//
//            rear=0 ;
//            rear = (rear+1)%(n+1);
//            n++;
//            q3[rear]=data;
//            return true;
//        }
//        static int dequeue(){
////            if(front==rear)
////                System.out.println();;
//            data =q3[front];
//            front =(front+1)%(n+1);
//            n--;
//            return data;
//        }
////    Queue<Integer> q1 = new LinkedList<Integer>();
////    Queue<Integer> q2 = new LinkedList<Integer>();
//
//    int size = 0;
//
//    public  void push(int data) {
//        q2.add(data);
//        size++;
//        while (!q1.isEmpty()) {
//             //q2.add(q1.peek());
//            q2.add(q1.remove());
//            // q1.remove();
//        }
//        Queue<Integer> temp = q1;
//        q1 = q2;
//        q2 = temp;
//    }
//
//    public void pop() throws Exception {
//        if (q1.isEmpty()) {
//            throw new Exception("Stack q1 is empty");
//            // System.out.println("nothing");
//        }
//        size--;
//        //return q1.remove();
//        System.out.println(q1.remove());
//       // System.out.println(q1.remove());
//    }
//
//
//
//        public void main(String[] args) throws Exception {
//           // StackusingTwoQueues s = new StackusingTwoQueues();
//            //int enqueue(data);
//           // int dequeue();
//           // Queue q= new Queue();
//
//            int n, ch=1,ans,rear=0,front=0;
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//            System.out.println("1: insertion" + "2:deletion");
//            ch=sc.nextInt();
//            while(ch==1)
//                System.out.println("would you like to switch the connect? ");
//            ans = sc.nextInt();
//            switch (ans) {
//                 int data = sc.nextInt();
//                case 1:
//                    if (enqueue(data))
//                        System.out.println("element add");
//                    else
//                        System.out.println("memory full");
//                    break;
//                case 2:
//                     dequeue();
//                    if (front == rear) System.out.println("memory empty ");
//                    else
//                        System.out.println(data = sc.nextInt());
//                    break;
//                case 3:
//                    push(data);
//                    break;
//                case 4:
//                    pop();
//                 //   System.out.println("remove1 :" + s.pop());
//           // System.out.println("remove2 :" + s.pop());
////            System.out.println("remove3 :" + s.pop());
////            System.out.println("remove4 :" + s.pop());
//            }
//
//
//            }
//
//
////            s.push(46);
////            s.push(21);
////            s.push(10);
////            s.push(67);
////            System.out.println("remove1 :" + s.pop());
////            System.out.println("remove2 :" + s.pop());
////            System.out.println("remove3 :" + s.pop());
////            System.out.println("remove4 :" + s.pop());
//        }
//
//
