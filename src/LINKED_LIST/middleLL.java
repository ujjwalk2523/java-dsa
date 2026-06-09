package LINKED_LIST;

public class middleLL {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println(middle(a));
        display(a);
    }
    public static void display(Node head) {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //1st method
   /* public static int middle(Node head) {
        Node temp=head;
        int length=0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=length/2;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    */
    //fast and slow method
    public static int middle(Node head) {
        Node temp=head;
        Node fast=head;
        Node slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
}
