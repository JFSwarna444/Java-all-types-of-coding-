import java.util.Stack;

class node{
        int data;
        node left;
        node right;
        public node(int item){
            data=item;
            left=right=null;
        }
}
public class Inordersequence {
    node root;
    void inorder(){
        if(root==null)
            return;
        Stack<node> p=new Stack<node>();
        node temp =root;
        while(temp!=null || p.size()>0){
            while(temp!=null){
                p.push(temp);
                temp=temp.left;
            }
            temp =p.pop();
            System.out.println(temp.data +" ");
            temp=temp.right;
        }
    }
    public static void main(String[] args) {
        Inordersequence s =new Inordersequence();
        s.root=new node(10);
        s.root.left=new node(20);
        s.root.right=new node(30);
        s.root.left.left=new node(2);
        s.root.left.right=new node(80);
        s.inorder();
    }
}
