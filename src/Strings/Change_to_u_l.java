package Strings;
import java.util.Scanner;
public class Change_to_u_l {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        if(s.charAt(0)>='a'&&s.charAt(0)<='z'){
            System.out.print(s.toLowerCase());
        }
        else{
            System.out.print(s.toUpperCase());
        }


    }
}
