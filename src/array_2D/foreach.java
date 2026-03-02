package array_2D;
import java.util.Scanner;
public class foreach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows and cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.print("enter elements:");
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(int[]a:arr){
           for(int ele:a){
               System.out.print(ele+" ");
           }
           System.out.println();

       }
    }
}
