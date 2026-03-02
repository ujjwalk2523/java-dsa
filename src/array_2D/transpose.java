package array_2D;
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows and cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        int[][] brr=new int[n][m];
        System.out.print("enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // normal print
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                brr[i][j]=arr[j][i];
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        //m2
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
