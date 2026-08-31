package stack;
import java.util.Stack;
public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,8,3,5,2,1,6,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[]=nextgreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] nextgreater(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[]nge=new int[n];
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&arr[i]>st.peek()){
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
        nge[n-1]=-1;
        return nge;
    }
}
