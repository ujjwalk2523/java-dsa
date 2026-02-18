package array;
import java.util.Scanner;
public class multiply_add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();}

        for(int i=0;i<arr.length;i++){
            if(i%2==1) System.out.print(arr[i]*=2);
            else System.out.print(arr[i]+=10);
            System.out.println();
        }
    }
}
