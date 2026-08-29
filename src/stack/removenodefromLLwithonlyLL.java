package stack;

public class removenodefromLLwithonlyLL {
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(8);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
       ListNode result= removenodes(a);
       display(result);

    }
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static ListNode removenodes(ListNode head) {
        head=reverse(head);
        int max=head.val;
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val<max){
                temp.next=temp.next.next;
            }
            else{
                max=temp.next.val;
                temp=temp.next;
            }
        }
       head= reverse(head);
        return head;
    }
    public static ListNode reverse(ListNode head) {
       ListNode fwd=null;
       ListNode prev=null;
       ListNode curr=head;
       while(curr!=null){
           fwd=curr.next;
           curr.next=prev;
           prev=curr;
           curr=fwd;
       }
       return prev;
    }
}
