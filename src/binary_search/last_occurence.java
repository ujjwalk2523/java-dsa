package binary_search;
import java.util.Scanner;
public class last_occurence {
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
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        int high=n-1;
        int low=0;
        int result=n;
        System.out.print("enter your target element:");
        int target=sc.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[target]){
                high=mid-1;
            }
            else if(arr[mid]<arr[target]){
                low=mid+1;
            }
            else if(arr[mid]==arr[target]){
                result=mid;
                low=mid+1;
            }
        }
        if(result!=n){
            System.out.print("last occurence of element:"+target+"  at index:"+result);
        }
    }
}
