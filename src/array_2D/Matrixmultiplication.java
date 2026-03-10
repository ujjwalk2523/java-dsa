package array_2D;

import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows cols of matrix 1:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("enter elements of matrix 1:");
        int[][] arr1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("enter cols of matrix 2:");
        int q = sc.nextInt();
        int[][] arr2 = new int[n][q];
        System.out.print("enter elements of matrix 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int[][] arr3 = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                  arr3[i][j] += arr1[i][k] * arr2[k][j];// ek baar samaj lena
                }
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }

}
