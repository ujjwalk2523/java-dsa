package array;
import java.util.Scanner;
public class swapthistothat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array element:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}

        System.out.print("enter from:");
        int from=sc.nextInt();
        System.out.print("enter to:");
        int to=sc.nextInt();
        while(from<to){
            int temp=arr[from];
            arr[from]=arr[to];
            arr[to]=temp;
            from++;
            to--;
        }
        System.out.print("the swapped array is:");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }


    }

}
