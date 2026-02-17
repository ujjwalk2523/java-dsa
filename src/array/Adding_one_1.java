package array;
import java.util.ArrayList;
import java.util.Scanner;
public class Adding_one_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int n = sc.nextInt();
        System.out.print("enter array elements from 0 to 9:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int carry=1;
        int k=0;
        int i=n-1;
        int brr[]=new int[n+1];
        for(int x=0;x<n;x++){
            int sum=carry;
            if(i>=0){
                sum+=arr[i];
                i--;
            }
            if(sum>9){
                carry=1;
                sum=sum-10;
            }
            else{carry=0;}
            brr[k]=sum;
            k++;
        }
        if(carry==1){
            brr[k]=carry;
            k++;
        }
        System.out.print("result:");
        for(int x=k-1;x>=0;x--){
            System.out.print(brr[x]+" ");
        }

    }
}
