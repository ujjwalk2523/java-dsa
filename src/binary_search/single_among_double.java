package binary_search;
import java.util.Scanner;
public class single_among_double {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
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
        if(n==1) {
            System.out.print(arr[0]);
            return;
        }
        if(arr[0]!=arr[1]){
            System.out.print(arr[0]);
            return;
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.print(arr[n-1]);
            return;
        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                System.out.print(arr[mid]);
                return;
            }
            int f=mid;
            int s=mid;
            if(arr[mid-1]==arr[mid]){
                f=mid-1;
            }
            else{
                s=mid+1;
            }
            int leftcount=f-low;
            int rightcount=high-s;
            if(leftcount%2==0){
                low=s+1;
            }
            else{
                high=f-1;
            }
            return;
        }


    }
}
