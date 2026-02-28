package binary_search;
import java.util.Scanner;
public class arranging_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //stair case problem
        System.out.print("enter number:");
        int n=sc.nextInt();
        int low=0;
        int high=n;
        int ans=0;
        if(n==0) {
            System.out.print(0);
        }
        while(low<=high){
            int mid=(low+high)/2;
            long coins=(long) mid*(mid+1)/2;
            if(coins==n){
                ans=mid;
                break;

            }
            if(coins<n){
                low=mid+1;
                ans=mid;
            }
            else{
               high=mid-1;
            }

        }
        System.out.print("full rows:"+ans);
    }
}
