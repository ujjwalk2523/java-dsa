package array;
import java.util.Scanner;
public class doubleno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter five numbers:");

        int [] arr=new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(2*arr[i]+" ");
        }

    }
}
