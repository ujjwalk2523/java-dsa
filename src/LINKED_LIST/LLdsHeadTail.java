package LINKED_LIST;

public class LLdsHeadTail {
    Node head;
    Node tail;
    int size;
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
    void display(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LLdsHeadTail ll=new LLdsHeadTail();
        ll.addtail(1);
        ll.addtail(2);
        ll.addtail(3);
        ll.addtail(4);
        ll.display();
        ll.addathead(5);
        ll.addtail(9);
        ll.display();
        ll.deletehead();
        ll.display();
        ll.deletetail();
        ll.display();

    }
    void deletehead(){
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
    void deletetail(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
       Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;

    }
}
