package recursion;
import java.util.Scanner;
public class existsornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("target:");
        int ele=sc.nextInt();
       boolean result = exists(arr,ele,0);
        System.out.print(result);


    }
    public static boolean exists(int[] arr,int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return exists(arr,ele,idx+1);
    }
}
