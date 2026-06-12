package LINKED_LIST;

public class sortlistusingmerge {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(40);
        Node d = new Node(80);
        Node e = new Node(10);
        Node f = new Node(70);
        Node g = new Node(30);
        Node h = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        display(a);
        a = sort(a);
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
    public static Node sort(Node head) {
        if(head==null||head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        Node left=sort(head);
        Node right=sort(head2);
        return merge(left,right);

    }

    public static Node merge(Node left,Node right){
        Node i=left;
        Node j=right;
        Node dummy=new Node(-1);
        Node k=dummy;
        while(i!=null&&j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null)k.next=j;
        else k.next=i;
        return dummy.next;
    }
}
