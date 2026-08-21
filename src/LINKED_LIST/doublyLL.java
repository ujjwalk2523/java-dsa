package LINKED_LIST;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertathead(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertattail(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteathead(){
        if(size==0){
            System.out.print("list is empty");
            return;
        }
        if(size==1){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    void deleteattail(){
        if(size==0){
            System.out.print("list is empty");
        }
        if(size==1){
            tail=head=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void insert(int idx, int val){
        if(idx<0||idx>size){
            System.out.print("invalid idx");
            return;
        }
        if(idx==0){
            insertathead(val);
            return;
        }
        if(idx==size){
            insertattail(val);
            return;
        }
        ListNode a=new ListNode(val);
        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        a.prev=temp;
        a.next=temp.next;
        temp.next=a;
        a.next.prev=a;
        size++;
    }
    void delete(int idx){
        if(idx<0||idx>size){
            System.out.print("invalid idx");
            return;
        }
        if(idx==0){
            deleteathead();
            return;
        }
        if(idx==size-1){
            deleteattail();
            return;
        }
        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size--;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayreverse(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

}
public class doublyLL {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertattail(1);
        list.insertattail(2);
        list.insertathead(3);
        list.insertathead(4);
        list.display();
       list.displayreverse();
        list.deleteathead();
        list.display();
        list.deleteattail();
        list.display();
        list.displayreverse();
        list.display();
        list.insert(1,80);
        list.display();
        list.delete(2);
        list.display();
    }
}
