package binary_search;
import java.util.Scanner;
public class floor_sqare_root {
    public static void main(String[] args) {
        System.out.print("enter array size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sorting
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("enter element ...i will return floor:");
        int ele=sc.nextInt();
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]*arr[mid]==ele){
                ans=arr[mid];
                break;
            }
            else if(arr[mid]*arr[mid]>ele){
                high=mid-1;
            }
            else{
                ans=arr[mid];
                low=mid+1;
            }
        }
        System.out.print("floor of element:"+ans);
    }
}
