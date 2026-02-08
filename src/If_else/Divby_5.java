package If_else;
import java.util.Scanner;
public class Divby_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
       // if (num % 5 == 0) System.out.println(num + " is a divisor of 5");
       // else System.out.println(num + " is not a divisor of 5");
        System.out.println(num%5==0?"divisor of 5":"not a divisor of 5");
    }
}
