package array_2D;
import java.util.Scanner;
public class revrow_thencol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[m][n];
        System.out.print("enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //normal matrix print
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //rev row matrix print
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //rev the column of rev row matrix
        System.out.println();
        for(int j=n-1;j>=0;j--){
            for(int i=m-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
