package recursion;
import java.util.Scanner;
public class CountAndSay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
       String s=sc.nextLine();
       int i=0;
       int j=0;
       String ans="";
       int count=0;
       while(j<s.length()){
           if(s.charAt(i)==s.charAt(j)){
               j++;
           }
           else{
               int freq=j-i;
               ans+=freq;
               ans+=s.charAt(i);
               i=j;
           }
       }
       int freq=j-i;
       ans+=freq;
       ans+=s.charAt(i);
       System.out.print(ans);
       // although we can do it using recursion also

    }
}
