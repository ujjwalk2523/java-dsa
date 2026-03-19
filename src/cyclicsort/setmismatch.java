package cyclicsort;
import java.util.ArrayList;
import java.util.Scanner;
public class setmismatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            int rightidx=arr[i]-1;
            if(arr[i]==i+1||arr[rightidx]==arr[i]){
                i++;
            }
            else{
                swap(arr,i,rightidx);
            }
        }
        ArrayList<Integer> dup=new ArrayList<Integer>();
        ArrayList<Integer> miss=new ArrayList<Integer>();
        for(i=0;i<n;i++){
           if(arr[i]!=i+1){
               dup.add(arr[i]);
               miss.add(i+1);
           }
        }
        System.out.print(dup+","+miss);

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
