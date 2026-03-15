package recursion;
import java.util.Arrays;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("enter the element you want to search:");
        int ele=sc.nextInt();
        int lo=0;
        int hi=arr.length-1;
        boolean result=helper(arr,ele,lo,hi);
        System.out.print(result);
    }
    public static boolean helper(int[]arr,int ele,int lo,int hi){
        int mid=(lo+hi)/2;
        if(lo>hi)return false;
        if(arr[mid]==ele){
            return true;
        }
        else if(arr[mid]>ele){
            return helper(arr,ele,lo,mid-1);
        }
        else {
            return helper(arr,ele,mid+1,hi);
        }
    }
}
