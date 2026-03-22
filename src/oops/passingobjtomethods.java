package oops;
import java.util.Scanner;
public class passingobjtomethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        car c1=new car();
        c1.length=4;
        c1.name="kia";
        c1.seats=4;
        c1.type="suv";
        change (c1);
        System.out.print(c1.seats);

    }
    public static void change(car x){
        x.seats=6;
        x.length=5;   //pass by reference

    }
    public static class car{
        int seats;
        String name;
        double length;
        String type;
    }

}
