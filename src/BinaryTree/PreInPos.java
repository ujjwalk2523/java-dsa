package BinaryTree;

import org.w3c.dom.ls.LSOutput;

public class PreInPos {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

}
