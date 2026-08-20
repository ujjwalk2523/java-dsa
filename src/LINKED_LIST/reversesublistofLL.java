package LINKED_LIST;

import java.util.ArrayList;

public class reversesublistofLL {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        display(a);
        sublist(a,3,6);
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
    //m1
    /*
    public static Node sublist(Node head,int a, int b){
        ArrayList<Node> list=new ArrayList<Node>();
        Node temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int i=a-1;
        int j=b-1;
        while(i<j){
            Node t1=list.get(i);
            Node t2=list.get(j);
            list.set(i,t2);
            list.set(j,t1);
            i++;j--;
        }
        for(i=0;i<list.size()-1;i++){
                list.get(i).next=list.get(i+1);
            }
        list.get(list.size()-1).next=null;
        return list.get(0);
    }*/
    //m2
    public static Node sublist(Node head,int l,int r){
        Node dummy=new Node(-1);

        dummy.next=head;
        Node temp=dummy;
        for(int i=1;i<l;i++){
            temp=temp.next;
        }
        Node tail1=temp;
        Node head2=tail1.next;

        for(int i=1;i<=r-l+1;i++){
            temp=temp.next;
        }
        Node tail2=temp;
        Node head3=temp.next;
        tail1.next=null;
        tail2.next=null;
       Node newhead =reverse(head2);
        tail1.next=newhead;
        head2.next=head3;
        return dummy.next;
    }
    public static Node reverse(Node head){
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
    
}
