package LINKED_LIST;

public class detectloop {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=c;
        System.out.print(detect(a));

    }
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
    public static boolean detect(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
