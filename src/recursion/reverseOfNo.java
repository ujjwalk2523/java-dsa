package recursion;
import java.util.Scanner;
public class reverseOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:");
        int n=sc.nextInt();
        int result=reverse(n,0);
        System.out.println(result);
    }
    public static int reverse(int n, int r){
        if(n==0){
            return r;
        }
         return reverse(n/10,(r*10)+(n%10));


    }
}
