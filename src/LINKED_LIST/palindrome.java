package LINKED_LIST;
import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.println(check(a));

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //m1 arraylist
    /*
    public static boolean check(Node head){
        Node temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            int a=list.get(i);
            int b=list.get(j);
            if(a!=b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }*/

    public static boolean check(Node head){
        Node slow=head;
        Node temp=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node a=slow.next;
        a=reverse(a);
       while(a!=null){
           if(temp.val!=a.val){
               return false;
           }
           temp=temp.next;
           a=a.next;
       }
       return true;
    }
    public static Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node b=head.next;
        head.next=null;
        Node c=reverse(b);
        b.next=head;
        return c;
    }
}
