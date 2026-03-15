package recursion;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        revprint(arr,0);
    }
    public static void revprint(int[]arr,int idx){
        if(idx==arr.length) return;
        revprint(arr,idx+1);
        System.out.print(arr[idx]+" ");

    }
}
