package LINKED_LIST;

public class rotateleftgfg {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
       Node x= rotateleftgfg(a,2);
       display(x);

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int length(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public static Node rotateleftgfg(Node head,int k){
        Node temp=head;
        int length=length(head);
        k=k%length;
        if(k==0||head==null||head.next==null){
            return head;
        }
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        Node x=temp.next;
        temp.next=null;
        Node tail=x;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return x;
    }
}
