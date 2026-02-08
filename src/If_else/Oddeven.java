package If_else;
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        //System.out.println(n%2==0?"Enen number":"Odd number");
        if(n%2==0) System.out.println(n+" is an even number");
        else System.out.println(n+" is an odd number");
    }
}
