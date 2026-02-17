package array;
import java.util.Scanner;
public class check_array_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements of the array:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for(int k=0;k<n-1;k++){
            if(arr[k]<arr[k+1]){
              flag=true;
            }
            else {
                flag=false;
            }
        }
        System.out.print(flag);
    }
}
