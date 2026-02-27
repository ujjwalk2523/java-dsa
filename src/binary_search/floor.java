package binary_search;
 import java.util.Scanner;
public class floor {
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
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int high=n-1;
        int low=0;
        int mark=-1;
        System.out.print("enter the floor value:");
        int floor=sc.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>floor){
                high=mid-1;
            }
            else if(arr[mid]<=floor){
                mark=mid;
                low=mid+1;
            }
        }
        System.out.print("The floor value is at index: "+mark);
    }
}
