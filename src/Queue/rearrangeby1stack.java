package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rearrangeby1stack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        display(q);
        rearrange(q);
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
    public static void rearrange(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        //reverse
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
}