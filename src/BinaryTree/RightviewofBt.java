package BinaryTree;

import java.util.ArrayList;

public class RightviewofBt {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        d.left = h;e.right = g;e.left = f;
        h.left = i;
        levels(a);
        System.out.println(rightview(a));
    }
    public static int levels(Node root) {
        if (root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static ArrayList<Integer> rightview(Node root) {
        ArrayList<Integer>ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }
    public static void view(Node root,int level,ArrayList<Integer> ans){
        if (root == null) return;
        if(level>=ans.size())ans.add(root.val);
        else ans.set(level,root.val);
        view(root.left,level+1,ans);
        view(root.right,level+1,ans);
    }



}
