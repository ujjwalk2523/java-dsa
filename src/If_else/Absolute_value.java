package If_else;
import java.util.Scanner;
public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        if(num<0) System.out.print("Absolute value:"+(-num));
        else System.out.print("Absolute value:"+(num));
    }
}
