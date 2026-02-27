package binary_search;
import java.util.Scanner;
public class mountain_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array for making mountain array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 1;
        int high = n - 2;
        int peak = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                peak = mid;
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (peak != -1) {
            System.out.print("peak:" + arr[peak]);
        }
    }
}
