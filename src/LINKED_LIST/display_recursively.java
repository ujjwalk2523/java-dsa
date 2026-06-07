package LINKED_LIST;


public class display_recursively {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayrec(a);
    }

    public static void displayrec(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(head.val + " ");
        displayrec(head.next);
    }
}