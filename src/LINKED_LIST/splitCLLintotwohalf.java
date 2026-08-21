package LINKED_LIST;

public class splitCLLintotwohalf {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
         d.next=e;
        e.next=f;
        f.next=a;
        makesingle(a);
        splithalf(a);

    }

    public static void displaycircular(Node head){
        Node temp=head;
             System.out.print(temp.val+" ");
             temp=temp.next;
            while(temp!=head ){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
    }
    public static void makesingle(Node head){
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void splithalf(Node head){
        Node temp1=head;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node h2=slow.next;
        slow.next=null;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=head;
        Node temp2=h2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=h2;
        displaycircular(head);
        System.out.println();
        displaycircular(h2);

    }
}
