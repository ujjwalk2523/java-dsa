package basics;

import java.util.Scanner;

public class Total_surface_area {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("length:");
        double l=sc.nextDouble();
        System.out.print("width:");
        double b=sc.nextDouble();
        System.out.print("height:");
        double h=sc.nextDouble();
        System.out.println("total surface area is:"+2*(l*b+b*h+h*l));

    }
}
