package array;
import java.util.Scanner;
public class segregate0nd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array elements 0 and 1 in any manner:");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //by method 1
       /* for(int i=0;i<n;i++){
            if(arr[i]==0) System.out.print(arr[i]+" ");
        }
        for(int j=0;j<n;j++){
            if(arr[j]==1) System.out.print(arr[j]+" ");
        }*/
        //by m2 2 pointer techq

       int i=0;
       int j=n-1;
       while(i<j){
           if(arr[i]==0) {
               i++;
           }
           else if(arr[j]==1) {
               j--;
           }
           else if(i>j) {
               break;
           }
          else if(arr[i]==1 && arr[j]==0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
           }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");

       }





    }
}
