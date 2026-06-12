package LINKED_LIST;

public class swappingnode {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        swap(a,2);
        display(a);

    }
    public static void display(Node head) {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void swap(Node head,int k){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=k;i++){
            if(fast==null){
                return;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast=head;
        for(int i=1;i<k;i++) {
            fast = fast.next;
        }
            int temp=fast.val;
            fast.val=slow.val;
            slow.val=temp;
        }
    }


