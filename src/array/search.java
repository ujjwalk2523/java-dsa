package array;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("enter the element you want to search:");
        int k=sc.nextInt();
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
          found=true;
          break;
        }
        if(found) System.out.print("element found..");
       else System.out.print("not found");
    }
}
