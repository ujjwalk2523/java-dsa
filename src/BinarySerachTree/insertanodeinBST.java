package BinarySerachTree;

public class insertanodeinBST {
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
        int key=7;
        display(a);
        insert(a,key);
        System.out.println();
        display(a);
    }
    public static void attach(Node root,int key){
        if(root==null)return;
        if(root.val==key)return;
        if(root.val<key){
            if(root.right==null)root.right=new  Node(key);
            else attach(root.right,key);
        }
        else{
            if(root.left==null)root.left=new Node(key);
            else attach(root.left,key);
        }
    }
    public static Node insert(Node root,int key){
        attach(root,key);
        return root;
    }
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
