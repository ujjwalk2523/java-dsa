package stack;
import java.util.Stack;
public class baseballgame {
    public static void main(String[] args) {
        String arr[]={"5","-2","4","C","D","9","+","+"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(calculate(arr));

    }
    public static int  calculate(String[] arr){
        int n=arr.length;
        Stack<Integer>st= new Stack<>();
        for(int i=0;i<n;i++){
            String s=arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")) {
                int top=st.pop();
                int top2=st.peek();
                int sum=top+top2;
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
    }

}
