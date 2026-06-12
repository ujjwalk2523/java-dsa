package LINKED_LIST;

public class rotaterightLC {
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
        a=rotate(a,3);
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
    public static int length(Node head){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
   public static Node rotate(Node head, int k){
        Node slow=head;
        Node fast=head;
        if(head==null||head.next==null||k==0){
            return head;
        }
        int n=length(head);
        k=k%n;
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node a=slow.next;
        slow.next=null;
        Node tail=a;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return a;
    }
}
