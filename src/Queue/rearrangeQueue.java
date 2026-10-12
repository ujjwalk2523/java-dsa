package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class rearrangeQueue {
    public static void main(String[] args) {
      Queue<Integer>q=new LinkedList<>();
      Queue<Integer>q2=new LinkedList<>();
      //always even size given
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.add(6);
      q.add(7);
      q.add(8);

      display(q);
      rearrange(q,q2);
      display(q);

    }
    public static void display(Queue<Integer>q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void rearrange(Queue<Integer>q,Queue<Integer>q2){
        int n=q.size();
        for(int i=1;i<=n/2;i++){
            q2.add(q.remove());
        }
        while(q2.size()>0){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
