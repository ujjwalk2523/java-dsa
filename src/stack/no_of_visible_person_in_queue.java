package stack;

import java.util.Stack;
public class no_of_visible_person_in_queue {
    public static void main(String[] args) {
        int arr[]={10,6,8,5,11,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[]=cansee(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
    public static int[] cansee(int[] arr){
        int n=arr.length;
        int [] ans=new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(!st.isEmpty()&&st.peek()<=arr[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;//imp
            ans[i]=count;
            st.push(arr[i]);

        }
        return ans;
    }
}
