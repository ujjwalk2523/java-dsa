package array_2D;
import java.util.Scanner;

public class pst_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input of row index:");
        int n=sc.nextInt();
        int arr[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
               if(j==0||j==i){
                   arr[i][j]=1;
               }
               else{
                   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
               }
            }
        }

            for(int j=0;j<=n;j++) {
                System.out.print(arr[n][j] + " ");
            }
    }
}
