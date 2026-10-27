package BinarySerachTree;

public class MaximumandMinimumelementinBST {
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
        System.out.println(minimum(a));
        System.out.println(maximum(a));
    }
    public static int minimum(Node root){
        if(root==null){
            return 0;
        }
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.val;
    }
    public static int maximum(Node root){
        if(root==null){
            return 0;
        }
        Node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.val;
    }
}
