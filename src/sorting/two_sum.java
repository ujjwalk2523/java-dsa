package sorting;
import java.util.Scanner;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter the array elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int swap=0;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swap++;
                }
            }
            if(swap==0) {
                break;
            }
        }
        System.out.print("sorted array is: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("enter two sum target:");
        int target=sc.nextInt();
        int j=n-1;
        int i=0;
        System.out.print("target found:");
        for( i=0;i<n;i++) {
            int sum=arr[i]+arr[j];

            if (sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else if (sum==target){
                System.out.print(arr[i]+","+arr[j]);
            }
        }
    }
}
