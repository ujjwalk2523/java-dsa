package LINKED_LIST;

public class searchatindex {
    Node head;
    int search(int val) {
        Node temp=head;
        int idx=0;
        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;
    }
    public static void display (Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
            }
            System.out.println();
        }
        public static void main (String[] args) {
        Node a  = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        searchatindex obj = new searchatindex();
        obj.head = a;
            System.out.println(obj.search(5));
            System.out.println(obj.search(6));

        }

}
