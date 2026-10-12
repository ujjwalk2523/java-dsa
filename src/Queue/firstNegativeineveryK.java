package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeineveryK {
    //subarray
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int arr[]={12,-1,-7,8,-15,30,16,28};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        solution(q,arr,3);
        display(q);

    }
    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void solution(Queue<Integer> q,int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<n-k+1;i++){
            while(q.size()>0&&q.peek()<i)q.remove();
            if(q.size()>0&&q.peek()<=i+k-1){
                System.out.print(arr[q.peek()]+" ");
            }
            else{
                System.out.print(0);
            }

        }

    }
}
