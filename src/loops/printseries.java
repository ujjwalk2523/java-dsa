package loops;
import java.util.Scanner;
public class printseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//m1
      /* for(int i=99;i>=1;i=i-4){
           System.out.print(i+" ");}
*/
        //m2
int a=99;
int d=4;
for(int i=1;i<=a;i++){
    System.out.print(a+" ");
    a=a-d;
}

    }
}
