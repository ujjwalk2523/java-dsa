package loops;
import java.util.Scanner;
public class takeandprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i +" ");
            System.out.print(n-(i-1)+"||");
        }

    }
}
