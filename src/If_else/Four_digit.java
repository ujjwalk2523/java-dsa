package If_else;
import java.util.Scanner;
public class Four_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n>999&&n<10000) System.out.println("it is a four digit no:");
        else System.out.println("it is not a four digit no:");
    }
}
