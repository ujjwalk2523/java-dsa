package array;
import java.util.Scanner;
public class merge_three_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st array size:");
        int n=sc.nextInt();
        System.out.print("enter 1st sorted array:");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter 2nd array size:");
        int m=sc.nextInt();
        System.out.print("enter 2nd sorted array:");

        int brr[]=new int[m];
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }
        System.out.print("Enter 3rd array size:");
        int o=sc.nextInt();
        System.out.print("enter 3rd sorted array:");

        int crr[]=new int[o];
        for(int i=0;i<o;i++){
            crr[i]=sc.nextInt();
        }
        int ans[]=new int[n+m+o];
        int i=0,j=0,k=0,l=0;
        for(;i<n&&j<m&&k<o;){
            if((arr[i]<=brr[j])&&(arr[i]<=crr[k])){
                ans[l]=arr[i];
                i++;
            }
            else if((brr[j]<=crr[k])&&(brr[j]<=arr[i])){
                ans[l]=brr[j];
                j++;
            }
            else if ((crr[k]<=arr[i]&&crr[k]<=brr[j])){
                ans[l]=crr[k];
                k++;
            }
            l++;
        }

        while (j<m&&k<o){
            if(brr[j]<=crr[k]){
                ans[l++]=brr[j++];
            }
            else{
                ans[l++]=crr[k++];
            }
        }
        while(i<n&&k<o){
            if(arr[i]<=crr[k]){
                ans[l++]=arr[i++];
            }
            else{
                ans[l++]=crr[k++];
            }
        }
        while(i<n&&j<m){
            if(brr[j]<=arr[i]){
                ans[l++]=brr[j++];
            }
            else{
                ans[l++]=arr[i++];
            }
        }
         if(i<n){
            ans[l++]=arr[i++];
        }
        else if(j<m){
            ans[l++]=brr[j++];
        }
        else if(k<o){
            ans[l++]=crr[k++];
        }
        System.out.print("result:");
        for(int x=0;x<ans.length;x++){
            System.out.print(ans[x]+" ");
        }

    }
}
