package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversefirstKelement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        display(q);
        reverseK(q,3);
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
    public static void reverseK(Queue<Integer> q,int k){
        int n=q.size();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }

    }

}
