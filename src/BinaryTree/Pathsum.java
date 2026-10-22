package BinaryTree;

public class Pathsum {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(13);
        Node f = new Node(4);
        Node g = new Node(7);
        Node h = new Node(2);
        Node i = new Node(1);
        a.left = b;a.right = c;
        b.left=d;
        d.left=g;d.right=h;
        c.left=e;c.right = f;
        f.right=i;
        int target=22;
        System.out.println(hassum(a,target));

    }
    public static boolean hassum(Node root,int target){
        if(root==null)return false;
        if(root.left==null&&root.right==null){
            if(target==root.val)return true;
            else return false;
        }
        return hassum(root.left,target-root.val)||hassum(root.right,target-root.val);
    }
}
