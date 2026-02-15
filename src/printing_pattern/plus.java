package printing_pattern;
import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");

        int n=sc.nextInt();
        if(n%2==0){ System.out.print("please enter any odd number");}
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == n / 2 + 1 || j == n / 2 + 1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
