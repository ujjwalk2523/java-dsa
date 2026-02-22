package sorting;
import java.util.Scanner;
public class bubble_sort_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }

            }

            if(swaps==0){
                break;
            }
        }
        System.out.print("The decending sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
