package BinaryTree;

public class pdtofnonzerosofBT {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);

        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        Node h = new Node(0);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        d.left = h;
        display(a);
        System.out.println();
        System.out.println(nonzeropdt(a));
    }
    //octopus structure print
    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int nonzeropdt(Node root){
        if(root == null){
            return 1;
        }
        if(root.val==0){
            return nonzeropdt(root.left)*nonzeropdt(root.right);
        }
        return root.val*nonzeropdt(root.left)*nonzeropdt(root.right);
    }
}
