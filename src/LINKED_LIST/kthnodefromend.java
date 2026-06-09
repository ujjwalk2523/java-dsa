package LINKED_LIST;

public class kthnodefromend {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        //Node ans=kthnode(a,2);
        //System.out.print(ans.val);
        System.out.print(kthnode(a,2));
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
//m1
    /*public static Node kthnode(Node head,int k){
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
       for(int i=1;i<=length-k;i++){
           temp=temp.next;
       }
       return temp;

    }*/
    //m2 fast and slow
    public static int kthnode(Node head,int k){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=k;i++){
            if(fast==null){
                return -1;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.val;

    }
}
