package If_else;
import java.util.Scanner;
public class Cooridinate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x axis:");
        int x=sc.nextInt();
        System.out.print("enter y axis:");
        int y=sc.nextInt();
        if(x==0 && y==0) System.out.println("origin");
        else if(x==0 ) System.out.println("y line");
        else if(y==0) System.out.println("x line");
        else if(x>0 && y>0) System.out.println("1st quadrant..");
        else if(x<0 && y>0) System.out.println("2nd quadrant..");
        else if(x<0 && y<0) System.out.println("3rd quadrant..");
        else if(x>0 && y<0) System.out.println("4th quadrant..");
    }
}
