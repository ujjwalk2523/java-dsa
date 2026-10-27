package BinarySerachTree;

public class serachinaBST {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(3);
        Node c=new Node(11);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(10);
        Node g=new Node(8);
        a.left=b;;a.right=c;
        b.left=d;b.right=e;
        e.right=g;
        c.left=f;
        int target=8;
        System.out.println(exists(a,target));
    }
    public static boolean exists(Node root,int target){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        else if(root.val>target){
            return exists(root.left,target);
        }
        else{
            return exists(root.right,target);
        }
    }

}
