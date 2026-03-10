package array_2D;
import java.util.Scanner;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter level:");
        int n=sc.nextInt();
        int [][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
               if(j==0 || j==i){
                   arr[i][j]=1;
               }
               else{
                   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
               }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
