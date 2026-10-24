package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class inordertraversal_iterative {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        d.right=h;
        System.out.println(iterative(a));
    }
    public static ArrayList<Integer> iterative(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr=root;
        while(st.size()>0||curr!=null){
            if(curr!=null){
                if(curr.left!=null){
                    st.push(curr);
                    curr=curr.left;
                }
                else{
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
            else{
                Node top=st.pop();
                ans.add(top.val);
                curr=top.right;
            }
        }
        return ans;
    }
}
