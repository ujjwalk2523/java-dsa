package sorting;
import java.util.Scanner;
public class selection_sort_largest_first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int maxdex=-1;
            for(int j=i;j<n;j++)
            {
                if (arr[j]>max){
                    max=arr[j];
                    maxdex=j;
                }
            }
            int temp=arr[maxdex];
            arr[maxdex]=arr[i];
            arr[i]=temp;
        }
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}

