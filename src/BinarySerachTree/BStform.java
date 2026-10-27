package BinarySerachTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class BStform {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(3);
        Node c=new Node(11);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(10);
        Node g=new Node(8);
        a.left=b;;a.right=c;
        b.left=d;b.right=e;
        e.right=g;
        c.left=f;
        display(a);
    }
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

}
