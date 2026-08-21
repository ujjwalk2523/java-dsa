package LINKED_LIST;

public class rotateDLL {
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
        a=rotate(a,2);
        display(a);

    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode rotate(ListNode head, int idx){
        if(head==null||head.next==null){
            return head;
        }

        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        ListNode newhead=temp.next;
        ListNode tail=newhead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head.prev=tail;

        temp.next=null;
        newhead.prev=null;
        return newhead;
    }

}
