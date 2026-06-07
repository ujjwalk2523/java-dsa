package LINKED_LIST;

public class insertidx {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
         a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        insertidx ll=new insertidx();
        ll.head=a;
        ll.tail=e;
        ll.size=5;
       display(a);
       ll.insert(30,3);
       display(a);
       ll.insert(40,4);
       display(a);

    }
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    Node head;
    int size;
    Node tail;
    void insert(int value,int idx){
        if(idx<0||idx>size){
            System.out.println("Invalid Input");
            return;
        }
        if(idx==0){
            addathead(value);
        }
        else if(idx==size){
           addtail(value);
        }
        else{
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            Node t= new Node(value);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    void addathead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void addtail(int val){
        Node temp=new Node(val);
        if(tail==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
}
