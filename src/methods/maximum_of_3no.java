package methods;
import java.util.Scanner;
public class maximum_of_3no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        maximum();


    }
    public static void maximum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three no_s: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.print("maximum of these are:"+Math.max(Math.max(x,y),z));

    }

}
