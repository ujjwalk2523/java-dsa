package cyclicsort;
import java.util.Scanner;

public class cyclicsort {
    public static void main(String[] args) {

        System.out.print("enter array size:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("enter elements:");
        //given 0 to n
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;

        while(i<n){
            if(arr[i]==i){
                i++;
            }
            else{
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}