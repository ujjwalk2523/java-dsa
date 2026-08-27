package stack;

import java.util.Stack;

public class peek_add_removeatanyposition {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //peek at index
        int idx=2;
        while(st.size()>idx+1){
            st2.push(st.pop());
        }
        System.out.println(st.peek());
        //add at index
        st.push(10);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st+" ");

        //remove at idx
        while(st.size()>idx+1){
            st2.push(st.pop());
        }
        st.pop();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st+" ");
    }
}
