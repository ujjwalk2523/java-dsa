package Strings;
import java.util.Scanner;
public class concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string 1:");
        String s1=sc.nextLine();
        System.out.print("enter your string 2:");
        String s2=sc.nextLine();
        //m1
        System.out.println(s1.concat(s2));

        //m2
        System.out.println(s1+s2);

        System.out.println("raghav"+10+20);
        System.out.println(10+20+"raghav");
        System.out.println(10+"raghav"+20);
        System.out.println('u'+"raghav"+2);
        System.out.println('u'+2+"raghav");


    }
}

