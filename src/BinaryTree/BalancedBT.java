package BinaryTree;

public class BalancedBT {
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
        System.out.println(isbalanced(a));
    }
    public static int levels(Node root){
        if(root==null){
            return 0;
        }
        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        if(Math.abs(leftlevels-rightlevels)>1)flag=false;
        return 1+Math.max(leftlevels,rightlevels);
    }
    //m1
    /*
    public static boolean isbalanced(Node root){
        if(root==null){
            return true;
        }
        int left=levels(root.left);
        int right=levels(root.right);
        if(Math.abs(left-right)>1)return false;
        return isbalanced(root.left)&&isbalanced(root.right);
    }*/
    static boolean flag;
    public static boolean isbalanced(Node root){
        if(root==null){
            return true;
        }
        flag=true;
        levels(root);
        return flag;
    }
}

