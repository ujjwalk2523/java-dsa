package If_else;
import java.util.Scanner;
public class DIv_by_5or3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0) System.out.println("yes div by 5 or 3...");
        else System.out.println("not div by 3 or 5...");
    }
}
