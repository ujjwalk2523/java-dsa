package array;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("enter the elements of the array:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        int i=0;
        int j=n-1;
       while(i<j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
        System.out.print("the reverse array is:");
       for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
       }

        }
    }

