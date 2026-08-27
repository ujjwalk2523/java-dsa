package stack;

import java.util.Stack;

public class traversingthestack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st.push(10);
        st.push(40);
        st.push(-2);
        st.push(30);
        st.push(80);

        //prints top to bottom
        while(st.size()>0){
           // System.out.print(st.pop()+" ");
            int top=st2.push(st.pop());
            System.out.print(top+" ");
           // st2.push(top);
        }
        //prints bottom to top
        System.out.println();
        while(st2.size()>0){
            int bottom=st.push(st2.pop());
            System.out.print(bottom+" ");
        }


    }
}
