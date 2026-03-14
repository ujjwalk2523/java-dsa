package recursion;
import java.util.Scanner;
public class sumofNaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int result=findsum(n);
        System.out.print(result);
    }
    public static int findsum(int n){
        if(n==0){
            return 0;
        }
        return n +findsum(n-1);
    }
}
