package loops;
import java.util.Scanner;
public class reverse_a_no {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a number:");
       int n=sc.nextInt();
       int r=0;
       while(n!=0){
           r=r*10;
           r=r+(n%10);
           n=n/10;
       }
       System.out.print("reverse number:"+r);
   }
}
