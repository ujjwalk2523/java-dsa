package array;

import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={5,6,7,8,9,10,11};
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        arr[5]=15;
        arr[6]=18;
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
