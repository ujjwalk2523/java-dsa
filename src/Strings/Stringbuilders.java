package Strings;
import java.util.Scanner;
public class Stringbuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("raghav");
        System.out.println(sb);
        sb.append("garg");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        String t=sb.toString();
        System.out.println(t);

    }
}
