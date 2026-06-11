package LINKED_LIST;
import java.util.Scanner;
import java.util.ArrayList;

public class reversealinkedlist {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(18);
        Node c=new Node(1);
        Node d=new Node(45);
        Node e=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        a=reverse(a);
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
   /* public static Node reverse(Node head){
        Node temp=head;
        ArrayList<Node>arr=new  ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        for(int i=n-1;i>=1;i--){
            Node t1=arr.get(i);
            Node t2=arr.get(i-1);
            t1.next=t2;
        }
        arr.get(0).next=null;
        return arr.get(n-1);
    }*/
    //m2 iterative
    /*
    public static Node reverse(Node head){
        Node fwd=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }*/
    //m3 recursive
    public static Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node a=head.next;
        head.next=null;
        Node b=reverse(a);
        a.next=head;
        return b;
    }
}
