package LINKED_LIST;

public class deleteatidx {
    public static  void main(String []args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        deleteatidx ll=new deleteatidx();
        ll.head=a;
        ll.tail=e;
        ll.size=5;
        ll.delete(3);
        display(a);
        ll.delete(4);
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
    int size;
    Node head;
    Node tail;
    void delete(int idx){
        Node temp=head;

        if(idx<0||idx>=size){
            System.out.println("invalid index");
            return;
        }
        if(idx==0) {
            deleteathead();
            return;
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        if(idx==size-1){
            tail=temp;
        }

        temp.next=temp.next.next;
        size--;
    }
    void deleteathead(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        size--;
    }
}
