package loops;
import java.util.Scanner;
public class displayap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        int a=2;
        int d=3;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+d;
        }


       /* for(int i=2;i<=3*n-1;i+=3){
            System.out.print(i+" ");
        }*/
    }
}
