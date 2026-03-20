package cyclicsort;
import java.util.Scanner;
public class firstmissingPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("enter the elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            if(arr[i]==i+1||arr[i]<=0||arr[i]>n||arr[i]==arr[arr[i]-1]){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.print(n+1);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
