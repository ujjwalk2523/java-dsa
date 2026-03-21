package oops;
import java.util.Scanner;
public class constructors {
    public static class car {
        int seats;
        String name;
        Double length;

        car() { //default constructor
        }

        car(int x, String s, double d) {
            seats = x;
            name = s;
            length = d;
        }

        car(String s, int x) {//constructor overloading
            seats = x;
            name = s;
        }
    }


    // method overloading
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        car c1 = new car(5,"kia",4);
        System.out.println(c1.name);
        System.out.println(c1.seats);
        car c2 = new car(4,"alto",3.75);
        System.out.println(c2.name);
        System.out.println(c2.seats);
        car c3 = new car("bmw",5);
        System.out.println(c3.name);
        System.out.println(max(10,20));
        System.out.println(max(50,60,70));
    }

}
