package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelwisearraylistprinting {
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
        System.out.println(levelwise(a));
    }
    public static ArrayList<ArrayList<Integer>>levelwise(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.add(new Pair(root,0));
        ans.add(new ArrayList<>());
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level!=currentLevel){
                currentLevel++;
                ans.add(new ArrayList<>());
            }
            ans.get(currentLevel).add(front.node.val);
            if(front.node.left!=null){
                q.add(new Pair(front.node.left,front.level+1));
            }
            if(front.node.right!=null){
                q.add(new Pair(front.node.right,front.level+1));
            }
        }
        return ans;
    }
}
