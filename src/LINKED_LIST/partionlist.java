package LINKED_LIST;

public class partionlist {
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(0);
        Node e=new Node(5);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        a=partion(a,3);
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
    public static Node partion(Node head,int x){
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node t1=d1;
        Node t2=d2;
        Node t=head;
        while(t!=null){
            if(t.val<x){
                t1.next=t;
                t1=t1.next;
            }
            else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        t1.next=d2.next;
        t2.next=null;
        return d1.next;
    }
}
