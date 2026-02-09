package loops;
import java.util.Scanner;
public class displaygp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int a=1;
        int r=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
    }
}
