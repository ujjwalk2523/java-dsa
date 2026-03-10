package array_2D;
import java.util.Scanner;
public class searchin2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size (m*m):");
        int m=sc.nextInt();
        int [][]arr=new int[m][m];
        System.out.print("enter elements as sorted matrix row cols:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("enter target element:");
        int n=sc.nextInt();
        int i=0;
        int j=m-1;
        boolean flag=false;
        while(j>=0 && i<m){
            if(arr[i][j]==n){
                flag=true;
                break;
            }
            else if(arr[i][j]>n){
                j--;
            }
            else if(arr[i][j]<n){
                i++;
            }
        }
        if(flag!=true){
            System.out.print("not found");
        }
        else{
            System.out.print("found");
        }


    }
}
