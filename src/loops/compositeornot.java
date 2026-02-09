package loops;
import java.util.Scanner;
public class compositeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        boolean flag=true;//prime...
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag=false;
                break;

            }
        }

            if(flag==false) System.out.println("composite no...");
            else if(flag==true) System.out.println("not a composite no...");

    }
}
