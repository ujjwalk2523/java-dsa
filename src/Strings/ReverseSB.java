package Strings;
import java.util.Scanner;
public class ReverseSB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;j--;
        }
        System.out.print(sb);
    }
}
