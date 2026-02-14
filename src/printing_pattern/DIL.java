package printing_pattern;
import java.util.Scanner;
public class DIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size:");
        int n = sc.nextInt();
        int nsp=0;
        int nst=2*n-3;
        for(int i=0;i<nst;i++){
            if(i==nst/2-2||i==nst/2+2|| i==nst/2-1|| i==nst/2+1)System.out.print("* ");
            else System.out.print("  ");

        }
        System.out.println();
        for(int i=0;i<nst;i++){
           if(i==nst/2)System.out.print("  ");
           else System.out.print("* ");

        }

        System.out.println();
        for(int i=0;i<nst;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("  ");
            }
            for(int j=0;j<nst;j++){
                System.out.print("* ");
            }
            nsp+=1;
            nst-=2;
            System.out.println();

        }
    }
}