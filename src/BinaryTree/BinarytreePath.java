package BinaryTree;

import java.util.ArrayList;

public class BinarytreePath {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        e.left=f;e.right=g;
        System.out.print(path(a));
    }
    public static ArrayList<ArrayList<Integer>>path(Node root){
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        dfs(root,new ArrayList<>(),ans);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if(root==null){
            return;
        }
        arr.add(root.val);
        if(root.left==null&&root.right==null){
            ArrayList<Integer> list=new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        dfs(root.left,arr,ans);
        dfs(root.right,arr,ans);
        arr.remove(arr.size()-1);//backtracking
    }
}
