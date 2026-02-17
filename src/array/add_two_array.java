package array;
import java.util.Scanner;
public class add_two_array {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st array size:");
        int n=sc.nextInt();
        System.out.print("enter elements of 1st array:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter 2nd array size:");
        int m=sc.nextInt();
        int[]brr=new int[m];
        System.out.print("enter elements of 2nd array:");
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }
        int max=(n>m)?n:m;
        int []crr=new int[max+1];
        int carry=0;
        int i=n-1;
        int j=m-1;
        int k=0;
       for(int x=0;x<max;x++){
           int sum=carry;
           if(i>=0){
               sum=sum+arr[i];
               i--;
            }
           if(j>=0){
               sum=sum+brr[j];
               j--;
           }
           if(sum>9){
               carry=1;
               sum=sum-10;
           }
           else{carry=0;}
           crr[k]=sum;
           k++;
        }
       if(carry==1){
           crr[k]=carry;
           k++;
       }
        System.out.print("result:");
       for(int x=k-1;x>=0;x--){
           System.out.print(crr[x]+" ");
       }

    }
}
