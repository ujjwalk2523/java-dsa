package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string--i will say is it palindrome or not:");
        String s=sc.nextLine();
        boolean palindrome=false;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                palindrome=true;
                i++;
                j--;
            }
            else{
                palindrome=false;
            }
            break;
        }
        if(palindrome==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
