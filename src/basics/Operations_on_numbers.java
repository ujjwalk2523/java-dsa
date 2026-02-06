package basics;


import java.util.Scanner;

public class Operations_on_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your two numbers:");
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        System.out.print("addition:");
        System.out.println(m + n);
        System.out.print("subtraction:");
        System.out.println(m - n);
        System.out.print("multiplication:");
        System.out.println(m * n);
        System.out.print("division:");
        System.out.println(m / n);
        System.out.print("modulus:");
        System.out.println(m % n);
    }
}
