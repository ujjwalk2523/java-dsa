package LINKED_LIST;

import java.util.ArrayList;

public class mergeksortedll {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(8);
        Node d=new Node(21);
        Node e=new Node(81);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node p=new Node(0);
        Node q=new Node(7);
        Node r=new Node(9);
        Node s=new Node(10);
        p.next=q;
        q.next=r;
        r.next=s;

        Node g=new Node(2);
        Node h=new Node(4);
        Node i=new Node(5);
        Node j=new Node(6);
        Node k=new Node(11);
        Node l=new Node(12);
        g.next=h;
        h.next=i;
        i.next=j;
        k.next=l;
        display(a);
        display(p);
        display(g);
        Node[]lists={a,p,g};
        Node result=mergeKLists(lists);
        display(result);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //m1 arraylists
    /*
    public static Node mergeKLists(Node[] Lists) {
        if(Lists.length==0)return null;
        ArrayList<Node> arr=new ArrayList<>();
        for(Node n:Lists){
            arr.add(n);
        }
        while(arr.size()>1){
            Node a=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node b=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node c=merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }*/

    //m2
    public static Node mergeKLists(Node[] lists){
        if(lists.length==0)return null;
        ArrayList<Node> arr=new ArrayList<>();
        for(Node x:lists){
            arr.add(x);
        }
        while(arr.size()>1){
            ArrayList<Node> temp=new ArrayList<>();
            for(int i=0;i<arr.size();i+=2){
                if(i+1<arr.size()) {
                    temp.add(merge(arr.get(i), arr.get(i + 1)));
                }
                    else{
                        temp.add(arr.get(i));

                    }
                }
            arr=temp;
            }
        return arr.get(0);
        }

    public static Node merge(Node a,Node b){
        Node i=a;
        Node j=b;
        Node dummy=new Node(-1);
        Node k=dummy;
        while(i!=null&&j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null){
            k.next=j;
        }
        if(j==null){
            k.next=i;
        }
        return dummy.next;
    }
}
