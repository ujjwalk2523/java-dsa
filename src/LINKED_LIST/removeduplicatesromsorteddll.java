package LINKED_LIST;

public class removeduplicatesromsorteddll {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3 );
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        display(a);
        duplicates(a);
        display(a);
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode duplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if(temp.val==temp.next.val){
                ListNode duplicate=temp.next;
                temp.next=duplicate.next;
                if(duplicate!=null){
                    duplicate.next.prev=temp;
                }
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}




