package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        display(q);
        reverse(q);
        display(q);
    }
    public static void display(Queue<Integer> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for(int i=0;i<n;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
          q.add(st.pop());
        }
    }
}
