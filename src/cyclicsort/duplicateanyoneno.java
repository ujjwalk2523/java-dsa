package cyclicsort;
import java.util.Scanner;
public class duplicateanyoneno {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the size of the array:");
       int n=sc.nextInt();
       System.out.print("enter the elements:");
       //element diya hai agr 1 to n like if input 5 so it contains only 1 to 4 no with any one repeated
       int[]arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }

       int i=0;

       while(i<n){
           if(arr[i]==i+1){
               i++;
           }
           else{
               int idx=arr[i]-1;
               if(arr[i]!=arr[idx]) {
                   swap(arr, i, idx);
               }
               else{
                   System.out.print(arr[i]);
                   return;
               }
           }
       }


   }
   public static void swap(int[]arr,int i,int j){
       int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
   }
}
