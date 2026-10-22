package BinaryTree;

public class elemntsofNthlevel {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        int k = 2;
        kthlevel(a, 0, k);
        System.out.println();
/*
we can also print level wise traversal by the help of kth function and level function
        for(int i=0;i<levels(a);i++){
            kthlevel(a,0,i);
            System.out.println();
        }
    }
    public static int levels(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    */
    }

    public static void kthlevel(Node root,int level,int k){
        if(root==null) return;
        if(level==k){
            System.out.print(root.val+" ");
        }
        kthlevel(root.left,level+1,k);
        kthlevel(root.right,level+1,k);
    }


}
