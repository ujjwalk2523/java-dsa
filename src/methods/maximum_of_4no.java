package methods;
import java.util.Scanner;
public class maximum_of_4no {
    public static void main(String[] args) {
        maximun();
    }
    public static void maximun(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 numbers:-");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();

        System.out.print("maximum of 4nos are:"+Math.max(Math.max(r,s),Math.max(p,q)));
    }
}
