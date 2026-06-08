package LINKED_LIST;

public class firstnodeofloop {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //f.next=c;
        detect(a);
    }
    public static void detect(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null||fast.next==null){
            System.out.println("no loop");
        }
        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
            }
            System.out.print(temp.val);
        }

    }


