package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Levelordertraversal_BFS {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(7);
        Node g = new Node(9);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        levelorder(a);

    }
    public static void levelorder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();
    }
}
