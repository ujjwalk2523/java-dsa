package Queue;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyQueue {
    Node head;
    Node tail;
    int size;

    void add(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class implementationofQueueviaLinkedList {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());


    }
}
