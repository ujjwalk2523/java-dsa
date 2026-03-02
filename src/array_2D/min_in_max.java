package array_2D;
import java.util.Scanner;
public class min_in_max {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows and cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print("enter elements:");
        int[][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minelement=Integer.MAX_VALUE;
        int row=-1;
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
            if(max<minelement){
                minelement=max;
                row=i+1;
            }
            System.out.println();
        }
        System.out.print("min ele out of all max ele of each row = "+minelement+" with row no is:"+row);

    }
}
