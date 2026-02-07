package If_else;
import java.util.Scanner;
public class Area_and_perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length:");
        int l=sc.nextInt();
        System.out.print("enter width:");
        int w=sc.nextInt();
        int a=l*w;
        int p=2*(l+w);
        if(a>p) System.out.println("area is greater than its perimeter" + "  area:"+(a)+ "  perimeter:"+(p));
        else if(a==p) System.out.println("area is equal to its perimeter" + "  area:"+(a)+ "  perimeter:"+(p));
        else System.out.println("area is less than its perimeter" + "  area:"+(a)+ "  perimeter:"+(p));

    }
}
