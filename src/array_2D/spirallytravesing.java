package array_2D;
import java.util.Scanner;
public class spirallytravesing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows and cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.print("enter the elements of the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int fr=0, lr=m-1, fc=0, lc=n-1;
        System.out.print("spiral output of the matrix is: ");
        while(fr<=lr&&fc<=lc){
            for(int j =fc;j<=lc;j++){
                System.out.print(arr[fr][j]+" ");
            }
            fr++;
            if(fr>lr||fc>lc){
                break;
            }
            for(int i=fr;i<=lr;i++){
                System.out.print(arr[i][lc]+" ");
            }
            lc--;
            if(fr>lr||fc>lc){
                break;
            }
            for(int j=lc;j>=fc;j--){
                System.out.print(arr[lr][j]+" ");
            }
            lr--;
            if(fr>lr||fc>lc){
                break;
            }
            for(int i=lr;i>=fr;i--){
                System.out.print(arr[i][fc]+" ");
            }
            fc++;
            if(fr>lr||fc>lc){
                break;
            }
        }
    }
}
