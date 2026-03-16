package recursion;
import java.util.Scanner;
public class uniquepath {
    /// down and right only to reach A to B
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter matrix size(m*n):");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int result=paths(m,n);
        System.out.print(result);
    }
    public static int paths(int m,int n){
        if(m==1||n==1)return 1;
        return paths(m-1,n)+paths(m,n-1);
    }
}
