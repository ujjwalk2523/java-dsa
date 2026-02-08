package If_else;
import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("Both....");
        else if(n%5==0) System.out.println("FIVE");
        else if(n%3==0) System.out.println("THREE");
        else System.out.println("NONE....");
    }
}
