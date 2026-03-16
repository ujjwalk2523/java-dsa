package recursion;
import java.util.Scanner;
public class waystoreachnthstair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nth:");
        int n=sc.nextInt();
        int result=stair(n);
        System.out.print(result);
    }
    public static int stair(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stair(n-1)+stair(n-2);
    }
}
