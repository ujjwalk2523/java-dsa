package array_2D;
import java.util.Scanner;
public class rowwithmaxsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print("enter elements:");
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int row=-1;
         int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
                row=i+1;
            }
            System.out.println();
        }
        System.out.print("maxsum="+maxsum+" with row no:"+row);


    }
}
