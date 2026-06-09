package LINKED_LIST;

public class intersectionof2LL {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(7);
        Node f = new Node(8);
        Node g = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node p=new Node(5);
        Node q=new Node(6);
        p.next=q;
        q.next=e;
        display(a);
        display(p);
        System.out.println(intersection(a,p).val);

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node intersection(Node head1, Node head2){
        int len1=0;
        Node temp1=head1;
        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }
        int len2=0;
        Node temp2=head2;
        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }
        temp1=head1;
        temp2=head2;
        if(len1>len2) {
            for (int i = 1; i <= len1 - len2; i++) {
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=1;i<= len2 - len1;i++) {
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
