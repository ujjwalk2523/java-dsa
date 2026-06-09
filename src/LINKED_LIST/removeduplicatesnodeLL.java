package LINKED_LIST;

public class removeduplicatesnodeLL {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(4);
        Node g=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        solution(a);
        display(a);

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node solution(Node head){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node i=head;
        while(i!=null){
            if(i.next==null||i.val!=i.next.val){
                t.next=i;
                t=i;
                i=i.next;
            }
            else{
                Node j=i.next;
                while(j!=null&&j.val==i.val){
                    j=j.next;
                }
                i=j;
            }
        }
        t.next=i;
        return head;

    }
}
