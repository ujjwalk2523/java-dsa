package loops;
import java.util.Scanner;
public class sumofno_and_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int original=n;
        int sum;
        int r=0;

        while(n!=0){
        r=r*10;
        r=r+n%10;
        n=n/10;
        }

        sum=original+r;
        System.out.print("sum of no and its reverse:"+(sum));
    }
}
