package BinaryTree;

import java.util.ArrayList;

public class TreeBoundaryTraversal {
    public static void main(String[] args) {
        Node a = new Node(31);
        Node b = new Node(18);
        Node c = new Node(80);
        Node d = new Node(3);
        Node e = new Node(24);
        Node f = new Node(57);
        Node g = new Node(112);
        Node h = new Node(-4);
        Node i = new Node(12);
        Node j = new Node(45);
        Node k = new Node(71);
        Node l = new Node(93);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        d.left = h;d.right = i;
        f.left = j;f.right = k;
        g.left = l;
        System.out.println(boundary(a));
    }
    public static ArrayList<Integer> boundary(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        if(root.left==null&&root.right==null)return ans;
        leftBoundary(root.left,ans);
        leafNode(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    /*
    public static void leftBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null)return;
        ans.add(root.val);
        if(root.left != null) leftBoundary(root.left, ans);
        else leftBoundary(root.right, ans);
    }
    */
    //m2
     public static void leftBoundary(Node root,ArrayList<Integer> ans){
         while(root!=null){
             if(root.left==null&&root.right==null)break;
             ans.add(root.val);
             if(root.left!=null)root=root.left;
             else root=root.right;
         }
     }
     //we can also do by iterative stack
    public static void leafNode(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null)ans.add(root.val);
        leafNode(root.left, ans);
        leafNode(root.right, ans);
    }
    /*
    public static void rightBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right!=null) rightBoundary(root.right, ans);
        else rightBoundary(root.left, ans);
        ans.add(root.val);
    }
    */
//m2
    public static void rightBoundary(Node root, ArrayList<Integer> ans) {
        ArrayList<Integer> ans2= new ArrayList<>();
        while(root!=null){
            if(root.left==null&&root.right==null)break;
            ans2.add(root.val);
            if(root.right!=null)root=root.right;
            else root=root.left;
        }
        for(int i=0;i<ans2.size()-1;i++){
            ans.add(ans2.get(i));
        }
    }

}
