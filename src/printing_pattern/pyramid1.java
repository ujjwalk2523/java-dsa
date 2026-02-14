package printing_pattern;
import java.util.Scanner;
public class pyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size:");
        int n = sc.nextInt();
        //m1
     /*   for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/

       //m2
        int nsp=n-1;
        int nst=1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=nsp;j++){
               System.out.print("  ");
           }
           for(int j=1;j<=nst;j++){
               System.out.print("* ");
           }
           nst+=2;
           nsp-=1;
           System.out.println();

       }
    }
}
