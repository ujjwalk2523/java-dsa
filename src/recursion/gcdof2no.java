package recursion;
import java.util.Scanner;
public class gcdof2no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 2 nums:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=gcd(a,b);
        System.out.print(result);
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
