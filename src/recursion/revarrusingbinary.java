package recursion;
import java.util.Arrays;
import java.util.Scanner;
public class revarrusingbinary {
    public static void main(String[] args) {
        System.out.print("enter size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int lo,int hi){
        if(lo>hi)return;
         int temp=arr[lo];
         arr[lo]=arr[hi];
         arr[hi]=temp;
         reverse(arr,lo+1,hi-1);

    }

}
