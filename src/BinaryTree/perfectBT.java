package BinaryTree;

public class perfectBT {
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
        int n=levels(a);
        int expectedNodes=(int)Math.pow(2,n)-1;
        int actualnodes=countnodes(a);
        if(actualnodes==expectedNodes){
            System.out.println("YES perfect BT");
        }
        else{
            System.out.println("NO");
        }

    }
    public static int levels(Node root){
        if(root == null){
            return 0;
        }
       return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static int countnodes(Node root){
        if(root == null){
            return 0;
        }
        return 1+countnodes(root.left)+countnodes(root.right);
    }
}
