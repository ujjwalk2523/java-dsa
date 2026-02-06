package basics;

import java.util.Scanner;

public class Volume_of_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the sphere:");
        double r = sc.nextDouble();
        System.out.print("volume of the sphere:");
        System.out.print(4.0/3.0*3.14*r*r*r);
    }
}
