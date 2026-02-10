package loops;
import java.util.Scanner;
public class print_num_nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
