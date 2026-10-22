package BinaryTree;



public class InvertBT {
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
        display(a);
        System.out.println();
        mirror(a);
        display(a);

    }
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void mirror(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    /*
    for inorder
    void mirror(Node root){
     if(root == null) return;
        mirror(root.left);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);

    }

     */

}
