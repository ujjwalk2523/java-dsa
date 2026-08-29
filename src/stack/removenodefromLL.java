package stack;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class removenodefromLL {
    public static void main(String[] args) {
        ListNode a=new ListNode(5);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(13);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        ListNode result=removeNodes(a);
        display(result);


    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode removeNodes(ListNode head){
        Stack<ListNode>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            while(st.size()>0&&st.peek().val<temp.val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
        temp=null;
        while(st.size()>0){
            ListNode top=st.pop();
            top.next=temp;
            temp=top;
        }
        return temp;
    }
}
