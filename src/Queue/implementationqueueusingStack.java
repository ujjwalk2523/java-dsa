package Queue;

import java.util.Stack;

class StackQueue{
    Stack<Integer> st=new Stack<>();
    Stack<Integer>helper=new Stack<>();
    //add or push efficient approach
    /*
    public void push(int x){
        st.push(x);
    }
    public boolean empty(){
        return (st.size()==0)?true:false;
    }
    public int pop(){
        while(st.size()>1){
            helper.push(st.pop());
        }
       int front = st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return front;
    }
    public int peek(){
        while(st.size()>1){
            helper.push(st.pop());
        }
        int front = st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return front;
    }
    */

    public void display(){
        while(st.size()>0){
            helper.push(st.pop());
        }
        while(helper.size()>0){
            int val = helper.pop();
            System.out.print(val+" ");
            st.push(val);
        }
        System.out.println();
    }
    //pop and peek efficient approach
    public int pop(){
        return st.pop();
    }
    public int peek(){
        return st.peek();
    }
    public boolean empty(){
        return (st.size()==0);
    }
    public void push(int x){
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }
}

public class implementationqueueusingStack {

    public static void main(String[] args) {
        StackQueue  q=new StackQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
        q.display();

    }
}
