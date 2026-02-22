package sorting;
import java.util.Scanner;
public class kth_smallest {
    public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++){
               if(arr[j]<min){
                   min=arr[j];
                   mindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
        }
        System.out.print("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("enter K value less than your array size:");
        int k=sc.nextInt();
        System.out.print(arr[k-1]);
    }
}
