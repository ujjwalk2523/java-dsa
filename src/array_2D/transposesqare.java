package array_2D;
import java.util.Scanner;
public class transposesqare {
    public static void main(String[] args) {
        System.out.print("enter rows and cols:");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.print("enter elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //normal matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
        //print
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
