package If_else;
import java.util.Scanner;
public class Greatest_of_them {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int a=sc.nextInt();
        System.out.print("enter second no:");
        int b=sc.nextInt();
        System.out.print("enter third no:");
        int c=sc.nextInt();
        if(a>b){
            if(a>c) System.out.println(a+"is greatest of them");
            else System.out.println(c+" is greatest of them");
        }
        if(b>a){
            if(b>c) System.out.println(b+" is greatest of them");
            else System.out.println(c+" is greatest of them");
        }
        else if(a==b && b==c && a==c) System.out.println("all are equal...");
        else if(a==b){
            if(a>c) System.out.println((a)+" is greatest of them");
            else System.out.println((c)+" is greatest of them");
        }
        else if(b==c){
            if(b>a) System.out.println(b+" is greatest of them");
            else System.out.println(a+" is greatest of them");
        }
        else if(a==c){
            if(a>b) System.out.println(a+" is greatest of them");
            else System.out.println(b+" is greatest of them");
        }

        }
}
