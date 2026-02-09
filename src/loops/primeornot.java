package loops;
import java.util.Scanner;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        boolean flag=true;//prime....
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag=false;
                break;//break use kr rhe hai iss liye kyu ki jitna bhi factors milenge wo sb composite print krenge is liye hmlog break use kr rhe hai taki ek bhi factor mile toh terminate ho jaye
            }
        }
        if(n==1||n==0) System.out.println("neither prime nor composite...");
        else if(flag==false) System.out.println("composite no..");
       else if(flag=true) System.out.println("prime no...");
    }
}
