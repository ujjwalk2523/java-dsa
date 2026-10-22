package BinaryTree;
//A Full Binary Tree is a binary tree in which every node has either 0 children or exactly 2 children.
// No node can have only one child.
public class FullbinaryTree {
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
