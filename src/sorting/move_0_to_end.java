package sorting;
import java.util.*;
public class move_0_to_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();

        System.out.print("Enter array elements: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       /* for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        // m2 better
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
