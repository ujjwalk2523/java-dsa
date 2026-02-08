package If_else;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first side:");
        int a=sc.nextInt();
        System.out.print("enter second side:");
        int b=sc.nextInt();
        System.out.print("enter third side:");
        int c=sc.nextInt();
        if(((a+b)>c && (a+c)>b && (b+c)>a)&&((a+b)!=c && (a+c)!=b && (b+c)!=a)) System.out.println("yes it is a triangle...");
        else System.out.println("not a triangle...");

    }
}
