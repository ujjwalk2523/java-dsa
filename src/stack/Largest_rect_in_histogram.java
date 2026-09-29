package stack;
import java.util.Stack;
public class Largest_rect_in_histogram {
    public static void main(String[] args) {
        int arr[]={5,3,6,2,5,4,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans=largestarea(arr);
        System.out.println("Area:"+ans);

    }
    public static int largestarea(int[] arr){
        int n =arr.length;
        int []nse=new int[n];
        nse[n-1]=n;//cal purpose
        Stack<Integer> st1=new Stack<>();
        st1.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st1.size()>0&&arr[st1.peek()]>=arr[i]) st1.pop();
            if(st1.isEmpty()) nse[i]=n;
            else nse[i]=st1.peek();
            st1.push(i);
        }
        Stack<Integer> st2=new Stack<>();
        int pse[]=new int [n];
        pse[0]=-1;
        st2.push(0);
        for(int i=1;i<n;i++){
            while(st2.isEmpty()&&arr[st2.peek()]>=arr[i]) st2.pop();
            if(st2.peek()==0) pse[i]=-1;
            else pse[i]=st2.peek();
            st2.push(i);

        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            int area=arr[i]*(nse[i]-pse[i]-1);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;

    }
}
