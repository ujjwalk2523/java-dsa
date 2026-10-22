package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class levelwiseprinting {
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
        levelorderLW(a);
    }
    public static void levelorderLW(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currlevel = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level!=currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null){
                q.add(new Pair(front.node.left,front.level+1));
            }
            if(front.node.right!=null){
                q.add(new Pair(front.node.right,front.level+1));
            }

        }
        System.out.println();

    }

}
