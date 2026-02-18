package array;
import java.util.Scanner;
public class targetsum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        int target=2;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                    flag=true;
            }
        }
        if(flag==true) System.out.print("mil gya hai ji");
        else System.out.print("not mil gya hai ji");
    }
}
