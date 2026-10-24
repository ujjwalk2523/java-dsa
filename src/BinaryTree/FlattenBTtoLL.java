package BinaryTree;

import java.util.ArrayList;

public class FlattenBTtoLL {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(14);
        Node f=new Node(11);
        Node g=new Node(15);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;
        e.right=g;
        flatten(a);
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.right;
        }
    }
    /*
    public static void flatten(Node root) {
        ArrayList<Node> arr=new ArrayList<>();
        dfs(root,arr);
        for(int i=0;i<arr.size()-1;i++){
            Node a=arr.get(i);
            Node b=arr.get(i+1);
            a.right=b;
            a.left=null;
        }
        Node last=arr.get(arr.size()-1);
        last.left=null;
        last.right=null;

    }
    public static void dfs(Node root,ArrayList<Node> arr){
        if(root==null){
            return;
        }
        arr.add(root);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
    */
    //m2 by only recursion 1

     public static void flatten(Node root){
         if(root==null){
             return ;
         }
         Node lst=root.left;
         Node rst=root.right;
         root.left=null;
         root.right=null;
         flatten(lst);
         flatten(rst);
         root.right=lst;
         Node lastlst=root;
         while(lastlst.right!=null){
             lastlst=lastlst.right;
         }
         lastlst.right=rst;
     }
}
