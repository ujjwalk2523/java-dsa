package LINKED_LIST;

public class removeduplicatesortedLL {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(2);
        Node f=new Node(3);
        Node g=new Node(4);
        Node h=new Node(4);
        Node i=new Node(4);
        Node j=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
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
    //m1 sliding window
  /*  public static void solution(Node head){
        Node i=head;
        Node j=head;
        while(j!=null){
            if(i.val==j.val){
                j=j.next;
            }
            else{
                i.next=j;
                i=j;
                j=j.next;
            }
        }
        i.next=null;
    }*/
//m2
    public static void solution(Node head){
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
}
