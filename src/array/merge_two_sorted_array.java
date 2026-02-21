package array;
import java.util.Scanner;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st array size:");
        int n=sc.nextInt();
        System.out.print("enter elements of 1st array in sorted order:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter 2nd array size:");
        int m=sc.nextInt();

        System.out.print("enter elements of 2nd array in sorted order:");

        int brr[]=new int[m];
        for(int i=0;i<m;i++) {
            brr[i] = sc.nextInt();
        }
        int []crr=new int[n+m];
        int k=0;
        int i=0;
        int j=0;
        for(;i<n && j<m;) {
            if(arr[i]<=brr[j]){
                crr[k]=arr[i];
                i++;
            }
            else{
                crr[k]=brr[j];
                j++;
            }
            k++;
        }
        for(;i<n;i++){
            crr[k]=arr[i];
            k++;
        }
        for(;j<m;j++){
            crr[k]=brr[j];
            k++;
        }

        System.out.print("result:");
        for(int x=0;x<crr.length;x++) {
            System.out.print(crr[x]+" ");
        }
    }
}