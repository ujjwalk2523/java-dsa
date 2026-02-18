package array;
import java.util.Scanner;
public class productofelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<n;i++){
            product=product*arr[i];
        }
        System.out.print("product:"+product);

    }
}
