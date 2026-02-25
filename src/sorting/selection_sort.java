package sorting;
import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
           int min=Integer.MAX_VALUE;
           int mindex=-1;
           for(int j=i;j<n;j++) {
               if(arr[j]<min) {
                   mindex = j;
                   min = arr[j];
               }
            }
           int temp=arr[i];
           arr[i]=arr[mindex];
           arr[mindex]=temp;
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
