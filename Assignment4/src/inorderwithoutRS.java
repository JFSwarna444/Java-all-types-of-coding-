public class inorderwithoutRS {
    node root;
    void moristraversal(node root){
        node temp,pre;
        if(root==null)
            return;
        temp=root;
        while(temp!=null){
            if(temp.left==null){
                System.out.println(temp.data+" ");
            }
            else{
                 pre=temp.left;
                 while(pre.right!=null){
                     if(pre.right==null){
                         pre.right=temp;
                     }
                     else{
                         pre.right=null;
                         System.out.println(temp.data+" ");
                         temp= temp.right;
                     }
                 }
            }
        }
    }
    public static void main(String[] args) {
        inorderwithoutRS rs=new inorderwithoutRS();
        rs.root=new node(10);
        rs.root.left=new node(20);
        rs.root.right=new node(30);
        rs.root.left.left=new node(40);
        rs.root.left.right= new node(50);
        rs.moristraversal(rs.root);
    }
}
