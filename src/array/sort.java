package array;
import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr)
    {
        System.out.print("sorted arrays:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
