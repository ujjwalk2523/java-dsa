package recursion;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.print(result);


    }
    public static int fact(int n){
        if(n==0||n==1) return 1;
        int ans=n*fact(n-1);
        return ans;
    }
}
