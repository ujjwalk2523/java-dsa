package LINKED_LIST;

public class reverseaDoublyLL {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.prev=e;
        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        display(a);
        a=reverse(a);
        display(a);

    }
/*
    //m1
    public static ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=pre;
            curr.prev=fwd;
            pre=curr;
            curr=fwd;
        }
        return pre;
    }
    */

     public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
     }

     //m2
    public static ListNode reverse(ListNode head){
         if(head==null||head.next==null){
             return head;
         }
        ListNode temp=null;
        ListNode curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        return temp.prev;
    }

}
