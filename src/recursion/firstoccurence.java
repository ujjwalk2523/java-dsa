package recursion;
import java.util.Arrays;
import java.util.Scanner;
public class firstoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("enter the elements of the array:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("enter target of 1st occurence:");
        int target=sc.nextInt();
        int hi=n-1;
        int lo=0;
        int result=foc(arr,target,lo,hi);
        System.out.print(result);
    }
    public static int foc(int[] arr,int target,int lo,int hi){
        int mid=lo+(hi-lo)/2;
        if(lo>hi)return -1;
        if(arr[mid]==target){
            int left=foc(arr,target,lo,mid-1);
            if(left==-1)return mid;
            else return left;

        }
        else if(arr[mid]>target){
            return foc(arr,target,lo,mid-1);
        }
        else  {
            return foc(arr,target,mid+1,hi);
        }
    }

}
