package oops;
import java.util.Scanner;
public class userdefinedatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1=new Student();  //declaration
        System.out.println("Enter Student1 details:");
        s1.name=sc.nextLine();
        s1.rno=sc.nextInt();
        s1.cgpa=sc.nextDouble();
        sc.nextLine();
        Student s2=new Student();
        System.out.println("Enter Student2 details:");
        s2.name=sc.nextLine();
        s2.rno=sc.nextInt();
        s2.cgpa=sc.nextDouble();

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);
    }
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
}
