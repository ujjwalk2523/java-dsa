package BinaryTree;

public class DiameterofBT {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        levels(a);
        System.out.println(diameter(a));
    }
    public static int  levels(Node root){
        if(root==null){
            return 0;
        }
        int  left=levels(root.left);
        int right=levels(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    //m1
    /*
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int a=levels(root.left)+levels(root.right);
        int b=diameter(root.left);
        int c=diameter(root.right);
        return Math.max(a,Math.max(b,c));
    }
    */
     static int max;
     public static int diameter(Node root){
         max=0;
         levels(root);
         return max;
     }
}
