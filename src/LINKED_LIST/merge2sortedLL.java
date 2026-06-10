package LINKED_LIST;

public class merge2sortedLL {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(30);
        Node c=new Node(40);
        Node d=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;

        Node p=new Node(20);
        Node q=new Node(50);
        Node r=new Node(70);
        Node s=new Node(80);
        Node t=new Node(90);
        p.next=q;
        q.next=r;
        r.next=s;
        s.next=t;
        display(a);
        display(p);
       Node mergehead= merge(a,p);
        display(mergehead);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node merge(Node head1,Node head2){
        Node i=head1;
        Node j=head2;
        Node dummy=new Node(-1);
        Node k=dummy;
        while(i!=null && j!=null){
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
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }
}
