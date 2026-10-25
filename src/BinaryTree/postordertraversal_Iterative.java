package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class postordertraversal_Iterative {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        System.out.println(iterative(a));
    }
    public static ArrayList<Integer> iterative(Node root) {
        ArrayList<Integer> ans= new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top=st.pop();
            ans.add(top.val);
            if(top.left!=null)st.push(top.left);
            if(top.right!=null)st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
