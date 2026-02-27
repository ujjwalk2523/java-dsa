package binary_search;
import java.util.Scanner;
public class m2sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.print("enter your target:");
        int tar = sc.nextInt();
        //ek hi binary search me kro!!
        int ans=-1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==tar){
                ans=mid;
                break;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<=tar &&  tar<arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            else{
                if(arr[mid]<tar &&  tar<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        if(ans!=-1){
            System.out.print("index of tar:"+ans);
        }
        else{
            System.out.print("not found");
        }
    }
}

