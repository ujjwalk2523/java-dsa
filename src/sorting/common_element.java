package sorting;
import java.util.Scanner;
public class common_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st array size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter 1st array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter 2nd array size:");
        int m=sc.nextInt();
        int [] brr=new int[m];
        System.out.print("enter 2nd array elements:");
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }
        int swap=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        System.out.print("1st sorted array: ");
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
       for(int i=0;i<m-1;i++){
           for(int j=0;j<m-1;j++){
               if(brr[j]>brr[j+1]){
                   int temp=brr[j];
                   brr[j]=brr[j+1];
                   brr[j+1]=temp;
                   swap++;
               }
           }
           if(swap==0){
               break;
           }
       }
        System.out.print("2nd sorted array: ");
       for(int i=0;i<m;i++){
           System.out.print(brr[i]+" ");
       }
        System.out.println();
        System.out.print("common element in both array:");
       int p=0;
       int q=0;
       for(int i=0;i<Math.max(m,n);i++){
           if (arr[p] == brr[q]) {
               System.out.print(arr[p]+" ");
               p++;
               q++;
           }
           else if (arr[p] > brr[q]) {
               q++;
           }
           else if (arr[p] < brr[q]) {
               p++;
           }
       }



    }

}
