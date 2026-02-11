package printing_pattern;
import java.util.Scanner;
public class square3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
               System.out.print((char)(j+64)+" ");
           }
           System.out.println();
        }
    }
}
