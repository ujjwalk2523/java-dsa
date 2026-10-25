package BinaryTree;

public class sizeofBT {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        Node h = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        display(a);
        System.out.println();
        System.out.println(size(a));
    }

    //octopus structure print
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsize=size(root.left);
        int rightsize=size(root.right);
        return 1+leftsize+rightsize;
    }
}

