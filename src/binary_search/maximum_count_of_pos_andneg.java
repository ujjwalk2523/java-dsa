package binary_search;
import java.util.Scanner;
public class maximum_count_of_pos_andneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements you want in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements you want in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int low=0;
        int high=n-1;
        int markN=n;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0){
                high=mid-1;
                markN=mid;
            }
            else{
                low=mid+1;
            }

        }
        int negcount=markN;
        int markP=n;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=0){
                low=mid+1;
                markP=mid;
            }
            else{
                high=mid-1;
            }
        }
      int poscount=n-(markP+1);
        System.out.print("poscount="+poscount);
        System.out.println();
        System.out.print("negcount="+negcount);
        System.out.println();
        System.out.print("max count: "+Math.max(poscount,negcount));
    }
}
