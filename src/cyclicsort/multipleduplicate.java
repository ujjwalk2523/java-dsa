package cyclicsort;
import java.util.ArrayList;
import java.util.Scanner;
public class multipleduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements of array:");
        int[]arr=new int[n];
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
        // Initialize ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
        // Loop through array and add duplicates to ans
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1 ) {
                ans.add(arr[i]);
            }
        }
        System.out.print(ans);

    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
