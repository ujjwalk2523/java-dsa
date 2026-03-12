package Strings;
import java.util.Scanner;
public class interningnew {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter string1:");
        String s1=sc.nextLine();
        System.out.print("enter string2:");
        String s2=sc.nextLine();
        boolean result=equals(s1,s2);
        System.out.print(result);
    }
    public static boolean equals(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;

    }

}
