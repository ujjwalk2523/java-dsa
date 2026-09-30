package stack;
import java.util.Stack;
public class MinStackwith1stackonly {
    Stack<Integer> stack;
    int min;
    public MinStackwith1stackonly() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        MinStackwith1stackonly obj = new MinStackwith1stackonly();
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
    public void push(int val){
        if(val>=min){
            stack.push(val);
        }
        else{
            stack.push(val+(val-min));
            min=val;
        }
    }
    public void pop(){
        if(stack.peek()>=min){
            stack.pop();
        }
        else{
            min=2*min-stack.peek();
            stack.pop();
        }
    }
    public int top(){
        if(stack.peek()<min){
            return min;
        }
        else{
            return stack.peek();
        }
    }
    public int min(){
        return min;
    }

}
