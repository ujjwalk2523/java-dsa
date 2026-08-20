package LINKED_LIST;
public class deleteandreverseCLL {
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
       a= reverse(a);
       a=deleteNode(a,8);
       display(a);
    }
    public static Node reverse(Node head){
        Node tail=head;
        while(tail.next!=head) {
            tail = tail.next;
        }
            tail.next=null;
            Node newhead=reverselist(head);
            head.next=newhead;
            return newhead;
    }
    public static Node reverselist(Node head){
        Node prev=null;
        Node curr=head;
        Node fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public static Node deleteNode(Node head, int key){
        Node tail=head;
        while(tail.next!=head){
            tail=tail.next;
        }
        tail.next=null;
        if(head.val==key){
            head=head.next;
            tail.next=head;
            return head;
        }
        Node temp=head;
        Node temp2=head.next;
        while(temp2!=null){
            if(temp2.val==key){
                temp.next=temp2.next;
                break;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        tail.next=head;
        return head;
    }
    public static void display(Node head){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.print(temp.val);
        System.out.println();
    }

}
