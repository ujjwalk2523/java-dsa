package BinaryTree;

public class constructBTfromInorderandPreorder {
    public static void main(String[] args) {
        int []inorder={4,2,8,5,9,1,6,3,7};
        int []preorder={1,2,4,5,8,9,3,6,7};
         Node root= tree(inorder,preorder);
         Printtree(root);
    }
    public static Node tree(int []inorder,int []preorder){
        int n=inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);

    }
    public static Node  build(int prelo,int prehi,int inlo,int inhi,int []inorder,int []preorder){
        if(prelo>prehi||inlo>inhi){
            return null;
        }
        int val=preorder[prelo];
        Node root=new Node(val);
        int r=-1;
        for(int i=inlo;i<=inhi;i++){//locating root
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int count=r-inlo;
        root.left=build(prelo+1,prelo+count,inlo,r-1,inorder,preorder);
        root.right=build(prelo+count+1,prehi,r+1,inhi,inorder,preorder);
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

