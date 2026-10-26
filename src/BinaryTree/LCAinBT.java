package BinaryTree;

public class LCAinBT {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(9);
        Node d=new Node(5);
        Node e=new Node(10);
        Node f=new Node(3);
        Node g=new Node(6);
        Node h=new Node(8);
        Node i=new Node(12);
        Node j=new Node(2);
        Node k=new Node(15);
        Node l=new Node(7);
        Node m=new Node(14);
        Node n=new Node(11);
        Node o=new Node(13);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        d.left=h;d.right=i;
        e.left=j;e.right=k;
        f.left=l;f.right=m;
        g.left=n;g.right=o;
        System.out.println(Lca(a,8,12).val);

    }
    //m1
    /*
    public static Node Lca(Node root,int p,int q){
        if(root==null) return null;
        if(root.val==p||root.val==q)return root;
        boolean pliesinleft=exists(root.left,p);
        boolean qliesinleft=exists(root.left,q);
        if(pliesinleft&&qliesinleft) return Lca(root.left,p,q);
        else if(!pliesinleft&&!qliesinleft) return Lca(root.right,p,q);
        else return root;
    }
    public static boolean exists(Node root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return exists(root.left,val)||exists(root.right,val);
    }
    */

    //m2 in one recursive

   public static Node Lca (Node root,int p,int q){
        if(root==null) return null;
        if(root.val == p || root.val == q) return root;
        Node l= Lca(root.left,p,q);
        Node r= Lca(root.right,p,q);
        if(l!=null&&r!=null) return root;
        if(l==null) return r;
        else return l;
    }



}
