package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class winnerofcirculargame {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("Ujjwal");
        q.add("Shivani");
        q.add("Kajal");
        q.add("Pritika");
        q.add("Arya");
        q.add("Anuu");
        q.add("Laxmii");
        q.add("Radhikaa");
        q.add("khushi");
        q.add("Roshnii");
        display(q);
        System.out.println("winner is:"+winner(q,10,1));
    }
    public static void display(Queue<String> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static String winner(Queue<String>q,int n, int k){
        while(q.size()>1){
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }

}
