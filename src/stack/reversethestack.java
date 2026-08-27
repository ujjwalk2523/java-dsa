package stack;

import java.util.Stack;

public class reversethestack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st3=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st+" ");
        //m1 by 3 statck
        /*
        while(st.size()>0) {
            st2.push(st.pop());
        }
        while(st2.size()>0) {
            st3.push(st2.pop());
        }
        while(st3.size()>0) {
            st.push(st3.pop());
        }
        System.out.println(st+" ");
        */
        //m2 by array

        int []arr=new int[st.size()];
        int i=0;
        while(st.size()>0){
            arr[i]=st.pop();
            i++;
        }

        for(int j=0;j<arr.length;j++){
            st.push(arr[j]);
        }
        System.out.print(st+" ");

    }
}
