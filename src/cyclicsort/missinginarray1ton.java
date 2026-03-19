package cyclicsort;
import java.util.Scanner;
public class missinginarray1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements in the array:");
        //given 1 to n numbers
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int m=arr.length+1;
        while(i<n){
            if(arr[i]==i+1 ||arr[i]==m){
                i++;
            }
            else{
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(m);

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
