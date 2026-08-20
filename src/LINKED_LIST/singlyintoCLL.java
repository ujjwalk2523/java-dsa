package LINKED_LIST;

public class singlyintoCLL {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        makecircular(a);
        display(a);
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    public static void makecircular(Node head){
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
    }
}
