package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class add_remove_peek_atAnyPos {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtindex(q,2,60);
        display(q);
        System.out.println( peek(q,2));
        display(q);
        System.out.println(remove(q,3));
        display(q);

    }
    public static void display(Queue<Integer> q) {
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void addAtindex(Queue<Integer>q,int idx,int val){
        if(idx<0||idx>q.size()){
            System.out.println("invalid idx");
            return;
        }
        int n=q.size();
        if(idx<n) {
            for (int i = 1; i <= idx; i++) {
                q.add(q.remove());
            }
        }
       q.add(val);
       for(int i=1;i<=n-idx;i++){
           q.add(q.remove());
       }

    }
    public static int peek(Queue<Integer>q,int idx){
        int n=q.size();
        for(int i=1;i<=idx;i++){
            q.add(q.remove());
        }
        int ans=q.peek();
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
        return ans;

    }
    public static int remove(Queue<Integer>q,int idx){
        int n=q.size();
        for(int i=1;i<=idx;i++){
            q.add(q.remove());
        }
       int ans= q.remove();
        for(int i=1;i<=q.size()-idx;i++){
            q.add(q.remove());
        }
        return ans;
    }
}
