package recursion;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 2 nums:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=lcm(a,b);
        System.out.print(result);
    }
    public static int lcm(int a,int b){
        if(a==0){
            return 0;
        }
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
