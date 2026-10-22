package BinaryTree;

import java.util.ArrayList;

public class PreorderTraversal {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        PreorderTraversal obj = new PreorderTraversal();
        System.out.println(obj.preorder(a));

    }
    public void dfs(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        dfs(root.left, ans);
        dfs(root.right, ans);
    }
    public ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
}
