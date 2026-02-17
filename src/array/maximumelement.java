package array;
import java.util.Scanner;
public class maximumelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.print("maximum element is:"+max);

    }
}
