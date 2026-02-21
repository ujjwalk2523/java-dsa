package array;
import java.util.Scanner;
public class sort_0_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements  which include 0,1,2:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int brr[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0) System.out.print(arr[i]+" ");
        }
        for(int j=0;j<n;j++){
            if(arr[j]==1) System.out.print(arr[j]+" ");
        }
        for(int k=0;k<n;k++){
            if(arr[k]==2) System.out.print(arr[k]+" ");
        }

    }
}
