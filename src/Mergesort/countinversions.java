package Mergesort;
import java.util.Scanner;
public class countinversions {
    static  int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter array element:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("inversion count:"+count);
    }
    public static void mergesort(int[] arr){
        if(arr.length==1){
            return;
        }
        int n=arr.length;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx++];
        }
        for(int j=0;j<b.length;j++){
            b[j]=arr[idx++];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);

    }
    public static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;

        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];969
                count+=(a.length-i);
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
