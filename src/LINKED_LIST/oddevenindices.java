package LINKED_LIST;

public class oddevenindices {
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
        a=indices(a);
        display(a);

    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node indices(Node head){
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node t1=odd;
        Node t2=even;
        Node t=head;
        while(t!=null){
            t1.next=t;
            t=t.next;
            t1=t1.next;
            t2.next=t;
            if(t!=null){
                t=t.next;
            }
            t2=t2.next;
        }
        t1.next=even.next;
        return odd.next;
    }
}
