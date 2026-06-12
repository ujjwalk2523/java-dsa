package LINKED_LIST;

public class swapnodesinpairs {
    public static void main(String[] args) {
        Node a=new Node(20);
        Node b=new Node(50);
        Node c=new Node(30);
        Node d=new Node(10);
        Node e=new Node(18);
        Node f=new Node(40);
        Node g=new Node(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        a=swap(a);
        display(a);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    /*public static Node swap(Node head){
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node t1=odd;
        Node t2=even;
        Node t=head;
        while(t!=null){
                 t1.next=t;
                 t=t.next;
                 t1=t1.next;
            if(t!=null){
                 t2.next=t;
                 t=t.next;
                 t2=t2.next;
            }
        }
        t1.next=null;
        t2.next=null;
        Node o=odd.next;
        Node e=even.next;
        Node dummy=new Node(-1);
        Node curr=dummy;
        while(o!=null||e!=null){
            if(e!=null){
                curr.next=e;
                curr=curr.next;
                e=e.next;
            }
            if(o!=null){
                curr.next=o;
                curr=curr.next;
                o=o.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }*/
    public static Node swap(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node a=head;
        Node b=head.next;
        Node dummy=new Node(-1);
        Node c=dummy;
        while(a!=null&&b!=null){
            c.next=b;
            a.next=b.next;
            b.next=a;
            c=a;
            a=a.next;
            if(a!=null){
                b=a.next;
            }
        }
        return dummy.next;
    }
}
