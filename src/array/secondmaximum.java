package array;
import java.util.Scanner;
public class secondmaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int n = sc.nextInt();
        System.out.print("enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondmax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
               max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
