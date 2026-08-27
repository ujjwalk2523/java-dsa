package stack;
import java.util.Stack;
public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s="aaabcccdeacb";
        System.out.println(s);
        System.out.println(Check(s));
    }
    public static Stack Check(String s){
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.size()==0||st.peek()!=ch){
                st.push(ch);
            }
        }
        /* returns answer in string
        String ans="";
        while(st.size()!=0){
            ans=st.pop()+ans;// preserves the original order while if we do ans+st.pop()--> gives us reverse order
        }
        return ans;
        */
        // if we want to return stack as a character
        Stack<Character> st2=new Stack<>();
        while(st.size()!=0){
            st2.push(st.pop());
        }
        while(st2.size()!=0){
            st.push(st2.pop());
        }
        return st;
    }
}
