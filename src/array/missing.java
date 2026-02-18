package array;
import java.util.Scanner;
public class missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n-1];
        System.out.print("enter first n array element miss anyone:");
        for(int i=0;i<n-1;i++){
        arr[i]=sc.nextInt();}
        int sum=(n*(n+1))/2;
        int arrsum=0;
        for(int i=0;i<n-1;i++){
            arrsum+=arr[i];
        }
        System.out.print("missing number is: "+ (sum-arrsum));

    }
}
