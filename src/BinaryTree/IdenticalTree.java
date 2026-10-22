package BinaryTree;

public class IdenticalTree {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(5);
        Node e=new Node(7);
        a.left=b;a.right=c;
        b.right=d;c.right=e;

        Node p=new Node(1);
        Node q=new Node(4);
        Node r=new Node(3);
        Node s=new Node(5);
        Node t=new Node(7);
        p.left=q;p.right=r;
        q.right=s;r.right=t;
        System.out.println(isidentical(a,p));
    }
    public static boolean isidentical(Node a,Node p){
        if(a==null && p==null) return true;
        if(a==null || p==null) return false;
        if(a.val!=p.val) return false;
        if(!isidentical(a.left,p.left) || !isidentical(a.right,p.right)) return false;
        return true;

    }
}
