package LINKED_LIST;

public class maximumtwin {
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(1);
        Node e=new Node(4);
        Node f=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.print(middle(a));
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int middle(Node head){
        Node temp=head;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node a=slow.next;
        a=reverse2(a);
        int max=Integer.MIN_VALUE;
        while(a!=null){
            max=Math.max(max,temp.val+a.val);
            temp=temp.next;
            a=a.next;
        }
        return max;
    }
    public static Node reverse2(Node head){
        Node fwd=null;
        Node cur=head;
        Node pre=null;
        while(cur!=null){
            fwd=cur.next;
            cur.next=pre;
            pre=cur;
            cur=fwd;
        }
        return pre;
    }

}
