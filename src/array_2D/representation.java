package array_2D;
import java.util.Scanner;
public class representation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       //take input and print
        System.out.print("enter row and column size:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print("enter elements:");
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
