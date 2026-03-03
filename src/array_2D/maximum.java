package array_2D;
import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[m][n];
        System.out.print("enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("maximum value:"+max);

    }
}
