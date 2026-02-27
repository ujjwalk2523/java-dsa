package binary_search;
import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //sorting
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("enter your target element:");
        int target=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>target) {
                    high=mid-1;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            }
            else {
                System.out.print("element found:"+arr[mid]+"  at index:"+mid);
                break;
            }
        }

    }
}
