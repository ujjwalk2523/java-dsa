package LINKED_LIST;

public class DeleteMidddleReturnAll {
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
        deletemiddle(a);
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
    public static void deletemiddle(Node head){
        Node prev=null;
        Node fast=head;
        Node slow=head;
        while (fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
            prev.next=slow.next;

    }
}
