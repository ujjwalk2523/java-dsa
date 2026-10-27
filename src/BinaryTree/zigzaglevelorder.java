package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class zigzaglevelorder {
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
        zigzag(a);
    }
    public static void zigzag(Node root) {
        if(root==null){
            return;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int currlevel=0;
        while(q.size()>0){
            int size = q.size();
            int [] arr=new int[size];
            for(int i=0;i<size;i++){
                Pair front=q.remove();
                int index;
                if(currlevel%2==0){
                    index=i;
                }
                else{
                    index=size-1-i;
                }
                arr[index]=front.node.val;
                if(front.node.left!=null){
                    q.add(new Pair(front.node.left,front.level+1));
                }
                if(front.node.right!=null){
                    q.add(new Pair(front.node.right,front.level+1));
                }
            }
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            currlevel++;
        }

    }

}
