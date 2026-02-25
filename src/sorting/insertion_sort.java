package sorting;
import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++) {
            int j=i;
            for( j=1;j<n;j++) {
               while(j>0&&arr[j]<arr[j-1]) {
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   j--;
               }

            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
