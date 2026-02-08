package If_else;
import java.util.Scanner;
public class Realno_to_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a real number:");
        double num=sc.nextDouble();
        int x=(int)num;
     //   if(num-x>0) System.out.print(num + " not an integer....");
     //   else System.out.print(num + " is an integer");
    if((num>0) && (num-x>0))
    System.out.println(num+" is not an integer");
    else if ((num<0) && (num-x<0))
    System.out.println(num + "is not an integer");
    else System.out.println(num + " is an integer");
    }

}
