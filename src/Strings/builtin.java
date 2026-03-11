package Strings;
import java.util.Scanner;
public class builtin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="shivani";
        System.out.println(s.indexOf('u'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("shivani"));
        System.out.println(s.contains("ujjwal"));
        System.out.println(s.startsWith("shivani"));
        System.out.println(s.endsWith("on"));
        s=s.toLowerCase();
        System.out.println(s);
        String u="shiv";
        System.out.println(u.compareTo(s));
    }
}
