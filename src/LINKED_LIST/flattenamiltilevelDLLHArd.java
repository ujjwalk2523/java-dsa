package LINKED_LIST;
class NodeD{
    int val;
    NodeD next;
    NodeD prev;
    NodeD child;
    NodeD(int val){
        this.val = val;
    }

}

public class flattenamiltilevelDLLHArd {
    public static void main(String[] args) {
        NodeD a=new NodeD(1);
        NodeD b=new NodeD(2);
        NodeD c=new NodeD(3);
        NodeD d=new NodeD(4);
        NodeD e=new NodeD(5);
        NodeD f=new NodeD(6);
        NodeD g=new NodeD(7);
        NodeD h=new NodeD(8);
        NodeD i=new NodeD(9);
        NodeD j=new NodeD(10);
        NodeD k=new NodeD(11);
        NodeD l=new NodeD(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        g.next=h;
        h.next=i;
        i.next=j;
        k.next=l;

        c.child=g;
        h.child=k;

        l.prev=k;
        j.prev=i;
        i.prev=h;
        h.prev=g;

        f.prev=e;
        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;
        display(a);
        a=solution(a);
        display(a);

    }
    public static void display(NodeD a){
        NodeD temp=a;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static NodeD solution(NodeD head) {
            if (head == null) return head;
            NodeD curr=head;
            while(curr!=null){
                if(curr.child==null){
                    curr=curr.next;
                }
                else{
                    NodeD fwd=curr.next;
                    NodeD c=solution(curr.child);
                    curr.child=null;
                    curr.next=c;
                    c.prev=curr;
                    NodeD temp=c;
                    while(temp.next!=null) {
                        temp = temp.next;
                    }
                        temp.next=fwd;
                        if(fwd!=null){
                            fwd.prev=temp;
                            curr=fwd;
                        }
                    }
            }
            return head;
    }



}
