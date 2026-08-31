package stack;
import java.util.Stack;
public class NextGreaterElement2 {
    public static void main(String[] args) {
        int arr[]={1,8,3,5,7,1,6,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[]=solve(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] solve(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--){
            st.push(arr[i]);
        }
        for(int i=n-1;i>=0;i--) {
            while(st.size()>0 && arr[i]>=st.peek()) {
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
