package LINKED_LIST;

public class clonelistwithrandompointer {
    public static void main(String[] args) {
        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        a.random=null;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;
        clonelistwithrandompointer obj=new clonelistwithrandompointer();
        Node ans=obj.copyRandomList(a);
        obj.display(ans);
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
        public Node deepcopy(Node head1){
            Node head2=new Node(-1);
            Node temp1=head1;
            Node temp2=head2;
            while(temp1!=null){
                Node t=new Node(temp1.val);
                temp2.next=t;
                temp2=t;
                temp1=temp1.next;
            }
            return head2.next;
        }
        public void merge(Node head1,Node head2){
            Node dummy=new Node(-1);
            Node temp=dummy;
            Node temp1=head1;
            Node temp2=head2;
            while(temp1!=null&&temp2!=null){
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;

                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;

            }
        }
        public void randomconnections(Node head1,Node head2){
            Node temp1=head1;
            Node temp2=head2;
            while(temp1!=null ){
                if(temp1.random==null) temp2.random=null;
                else{
                    temp2.random=temp1.random.next;
                }
                temp1=temp1.next.next;
                if(temp2.next!=null)temp2=temp2.next.next;
                else{
                    temp2=null;
                }
            }
        }
        public  void split(Node head1){
            Node dummy1=new Node(-1);
            Node temp1=dummy1;
            Node dummy2=new Node(-1);
            Node temp2=dummy2;
            Node temp=head1;
            while(temp!=null){
                temp1.next=temp;
                temp=temp.next;
                temp1=temp1.next;

                temp2.next=temp;
                temp=temp.next;
                temp2=temp2.next;
            }
            temp1.next=null;
        }
        public Node copyRandomList(Node head1){
            //step1: creating deep copy without random
            Node head2=deepcopy(head1);
            //step2: alternatively connecting lists
            merge(head1,head2);
            //step3: assigning random pointer
            randomconnections(head1,head2);
            //step4: split the list
            split(head1);
            return head2;
        }
    }
