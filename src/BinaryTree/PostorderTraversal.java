package BinaryTree;

import java.util.ArrayList;

public class PostorderTraversal {
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
        PostorderTraversal obj = new PostorderTraversal();
        System.out.println(obj.postorder(a));
    }
    ArrayList<Integer> postorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;

    }
    void dfs(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        dfs(root.left, ans);
        dfs(root.right, ans);
        ans.add(root.val);
    }
}
