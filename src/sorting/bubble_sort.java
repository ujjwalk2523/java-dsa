package sorting;
import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("enter the elements of the array:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // method 1 not better
        /*for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        // m2 more better
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
