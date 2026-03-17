package Mergesort;
import java.util.Scanner;
public class mergesort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void mergeSort(int[]arr){
        if(arr.length==1){
            return;
        }
        int n=arr.length;
        int[]a=new int[n/2];
        int[]b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++){
          a[i]=arr[idx++];}
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void merge(int[]a,int[]b,int[]arr){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }
        while(i<a.length){
            arr[k++]=a[i++];
        }
        while(j<b.length){
            arr[k++]=b[j++];
        }

    }
}
