package array_2D;
import java.util.Scanner;
public class snakecol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.print("enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //normal matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
