package LINKED_LIST;

public class reorderlist {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        reorder(a);
        display(a);
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reorder(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node a=slow.next;
        slow.next=null;
        a=reverse(a);
        while(a!=null){
          Node t1=temp.next;
          Node t2=a.next;
          temp.next=a;
          a.next=t1;
          temp=t1;
          a=t2;
        }
        return head;



    }
    public static Node reverse(Node head){
        Node fwd=null;
        Node prev=null;
        Node cur=head;
        while(cur!=null) {
            fwd = cur.next;
            cur.next=prev;
            prev=cur;
            cur=fwd;
        }
        return prev;
    }
}
