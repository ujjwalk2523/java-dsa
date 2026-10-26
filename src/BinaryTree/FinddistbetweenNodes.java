package BinaryTree;

public class FinddistbetweenNodes {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(14);
        Node f=new Node(11);
        Node g=new Node(15);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;
        e.right=g;
        System.out.println(finddist(a,9,15));

    }
    public static int finddist(Node root,int a,int b){
        Node LCA=lca(root,a,b);
        if(LCA==null){
            return -1;
        }
        int[]dis={0,0};
        dfs(LCA,a,b,0,dis);
        return dis[0]+dis[1];
    }
    public static void dfs(Node root,int a,int b,int level,int[]dis){
        if(root==null){
            return;
        }
        if(root.val==a)dis[0]=level;
        if(root.val==b)dis[1]=level;
        dfs(root.left,a,b,level+1,dis);
        dfs(root.right,a,b,level+1,dis);
    }
    public static Node lca(Node root,int p,int q){
        if(root==null)return null;
        if(root.val==p || root.val==q)return root;
        Node l=lca(root.left,p,q);
        Node r=lca(root.right,p,q);
        if(l!=null&&r!=null)return root;
        if(l==null)return r;
        else return l;
    }
}
