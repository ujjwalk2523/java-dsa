package oops;
import java.util.Scanner;
 class students{
    String name;
    private int rno;
    double cgpa;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}
public class privatekeyall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        students s1=new students();
        s1.cgpa=9.8;
        s1.name="ujjwal";
        System.out.println(s1.cgpa);
        System.out.println(s1.name);
        s1.print();


    }
}
