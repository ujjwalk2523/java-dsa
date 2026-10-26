package BinaryTree;

public class constructBTfromInorderandPostorder {
    public static void main(String[] args) {
        int []inorder={4,2,8,5,9,1,6,3,7};
        int []postorder={4,8,9,5,2,6,7,3,1};
        Node root=tree(inorder,postorder);
        Printtree(root);

    }
    public static Node tree(int []inorder,int []postorder){
        int n=postorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }

    public static Node build(int postlo, int posthi, int inlo, int inhi, int[] inorder, int[] postorder) {
        if(postlo>posthi||inlo>inhi)return null;
        int val=postorder[posthi];
        Node root=new Node(val);
        int r=-1;
        for(int i=inlo;i<=inhi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int count=r-inlo;
        root.left=build(postlo,postlo+count-1,inlo,r-1,inorder,postorder);
        root.right=build(postlo+count,posthi-1,r+1,inhi,inorder,postorder);
        return root;
    }
    public static void Printtree(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        Printtree(root.left);
        Printtree(root.right);
    }
}
