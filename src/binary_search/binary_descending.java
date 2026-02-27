package binary_search;
import java.util.Scanner;
public class binary_descending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int high=n-1;
        int low=0;
        System.out.print("enter the target element:");
        int target=sc.nextInt();
       while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                low=mid+1;
            }
            else if(arr[mid]<target){
                high=mid-1;
            }
            else if(arr[mid]==target){
                System.out.print("target:"+target+"   at index:"+mid);
                return;
            }
        }
    }
}
