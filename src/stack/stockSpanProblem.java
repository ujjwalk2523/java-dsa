package stack;
import java.util.Stack;
/*
class solution{
    public static class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
}
*/

public class stockSpanProblem {
    public static void main(String[] args) {
        int arr[]={100,80,90,70,60,75,85};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int span[]=calculateSpan(arr);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
   /* public static int[] calculateSpan(int [] arr){
        int n=arr.length;
        int[] span=new int[n];
        span[0]=1;
        Stack<solution.Pair> st=new Stack<>();

        st.push(new solution.Pair(arr[0],0));
        for(int i=1;i<n;i++){
            while(st.size()>0&&st.peek().val<=arr[i]){
                st.pop();
            }

        if(st.size()==0) {
            span[i] = i - (-1);
        }
            else {
                span[i]=i-st.peek().idx;
            }
           st.push(new solution.Pair(arr[i],i));
        }
        return span;
    }*/

    //m2 without pair
    public static int[] calculateSpan(int[] arr){
        int n=arr.length;
        int []span=new int[n];
        span[0]=1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()==0)span[i]=i-(-1);
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;


    }
}
