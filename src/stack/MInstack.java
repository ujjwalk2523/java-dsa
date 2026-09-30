package stack;
import java.util.Stack;
//BY TWO STACK
public class MInstack {
    public static void main(String[] args) {
        MInstack obj = new MInstack();
        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);
        System.out.println("top:"+obj.top());
        System.out.println("min:"+obj.min());
        obj.pop();
        System.out.println("top:"+obj.top());
        System.out.println("min:"+obj.min());
        obj.pop();
        System.out.println("top:"+obj.top());
        System.out.println("min:"+obj.min());

    }
    Stack<Integer>st;
    Stack<Integer>minst;
    public MInstack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if(minst.size()==0||val<minst.peek()){
            minst.push(val);
        }
        else{
            minst.push(minst.peek());
        }
    }
    public void pop() {
        st.pop();
        minst.pop();
    }
    public int top() {
        return st.peek();
    }
    public int min() {
        return minst.peek();
    }
}
