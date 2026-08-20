package LINKED_LIST;

public class addnumberLL {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(9);
        Node c=new Node(7);
        Node d=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;

        Node p=new Node(6);
        Node q=new Node(9);
        Node r=new Node(2);
        p.next=q;
        q.next=r;
        display(a);
        display(p);
       a= reverse(a);
       p= reverse(p);
       Node ans=add(a,p);
       ans=reverse(ans);
       display(ans);

        //display(a);
       // display(p);


    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public static Node add(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        Node dummy=new Node(-1);
        int carry=0;

        Node t=dummy;
        while(t1!=null||t2!=null||carry!=0){
            int sum=carry;
         if(t1!=null){
             sum+=t1.val;
             t1=t1.next;
         }
         if(t2!=null){
             sum+=t2.val;
             t2=t2.next;
         }
         carry=sum/10;
         sum=sum%10;
         t.next=new Node(sum);
         t=t.next;
        }
        return dummy.next;
    }
}
