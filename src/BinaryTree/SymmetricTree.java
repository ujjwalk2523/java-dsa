package BinaryTree;

public class SymmetricTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(4);
        Node g = new Node(3);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;

        System.out.println(isSymmetric(a));
    }
    public static boolean isSymmetric(Node root) {
        if(root==null)return true;
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
    public static boolean isIdentical(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(!isIdentical(p.left,q.left) || !isIdentical(p.right,q.right)) return false;
        return true;
    }
    public static void mirror(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
