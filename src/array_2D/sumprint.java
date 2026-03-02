package array_2D;
import java.util.Scanner;
public class sumprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[m][n];
        System.out.print("Enter the elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int j=0;j<m;j++){
            for(int k=0;k<n;k++){
                System.out.print(arr[j][k]+" ");
                sum+=arr[j][k];
            }
            System.out.println();
        }
        System.out.print("sum is:"+sum);
    }
}
