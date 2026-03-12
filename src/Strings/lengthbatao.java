package Strings;
import java.util.Scanner;
public class lengthbatao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String str=sc.nextLine();
        System.out.println(str.length());
        String s="3423431";
        int n= Integer.parseInt(s);
        System.out.println(n+1);
        // str to char

        String u="raghav";
        char[]arr=u.toCharArray();
        for(char ch:arr){
            System.out.print(ch);
        }
        System.out.println();
        String p="pinky";
        System.out.println(p);
        p="madhav";
        System.out.println(p);
        System.out.println(p.substring(3));
        System.out.println(p.substring(1,5));
        String s1="bishal";
        String s2=new String("bishal");
        System.out.println(s1==s2);  //false
        s1.equals(s2);
        System.out.println(s1==s2);

    }
}
