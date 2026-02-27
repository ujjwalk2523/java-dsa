package binary_search;
import java.util.Scanner;
public class sorted_rotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target:");
        int target=sc.nextInt();
        int[]arr={5,6,7,8,9,10,1,2,3};
        int low=0;
        int n=arr.length;
        int high=n-1;
        int pivot=0;
        //for finding pivot
       while(low<high){
           int mid=(low+high)/2;
           if(arr[mid]>arr[high]){
               low=mid+1;
           }
           else{
               high=mid;
           }
       }
       pivot=low;
        System.out.println("pivot index:"+pivot);
        // decide side which side left or right
        int left,right;
        if(target>=arr[0]){
            left=0;
            right=pivot-1;
        }
        else{
            left=pivot;
            right=n-1;
        }
        //binary search ab lagega
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.print("index of target is:"+ans);
    }
}
