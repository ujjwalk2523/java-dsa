package binary_search;
import java.util.Scanner;
public class first_occurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
           //first occurence
            int high=n-1;
           int low=0;

           int result=-1;
            System.out.print("enter your target element:");
            int target=sc.nextInt();
           while(low<=high){
               int mid=(high+low)/2;
               if(arr[mid]>target){
                   high=mid-1;
               }
               else if(arr[mid]<target){
                   low=mid+1;
               }
               else if(arr[mid]==target){
                   result=mid;
                   high=mid-1;

               }
           }
           if(result!=-1){
               System.out.print("first occurence of:"+target+"  at index:"+result);
           }
           else {
               System.out.print("element not found");
           }
        }
    }

