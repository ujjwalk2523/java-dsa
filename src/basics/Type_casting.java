package basics;

import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any no:");
        int a=sc.nextInt();
        char ch=(char)a;
        System.out.print("ascii value:");
        System.out.println(ch);
        System.out.print("enter any character:");
        char ch1=sc.next().charAt(0);
        int a1=(int)ch1;
        System.out.println("ascii value:"+a1);

    }
}
