package basics;

import java.util.Scanner;

public class Area_of_circle {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle:");
        double r = sc.nextDouble();
        System.out.print("circumference of the circle:");
        System.out.println(2*3.14*r);
        System.out.print("area of the circle:");
        System.out.println(3.14*r*r);
    }
}
