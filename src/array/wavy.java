package array;
import java.util.Scanner;
public class wavy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter elements:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2){
            if (arr[i]<arr[i+1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;


            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
