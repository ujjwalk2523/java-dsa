package stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Stack{
    Node head;
    int len;
    int peek(){
        if(head==null){
            return -1;
        }
        return head.val;
    }
    int pop()throws Exception{
        if(head==null){
            throw new Exception("stack underflow Error");
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node temp=new Node(ele);
        if(len==0) head=temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node  temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class ViaLinkedList {
    public static void main(String[] args)throws Exception {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
    }

}
