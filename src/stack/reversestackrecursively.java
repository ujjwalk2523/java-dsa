package stack;

import java.util.Stack;

public class reversestackrecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st + " ");
        reverse(st);
        System.out.println(st + " ");
    }

    public static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushatbottom(st, top);
    }

    public static void pushatbottom(Stack<Integer> st, int top) {
        if(st.size()==0){
            st.push(top);
            return;
        }
        int ele = st.pop();
        pushatbottom(st,top);
        st.push(ele);
    }
}

