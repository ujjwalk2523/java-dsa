package Strings;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="match:-ujjwal loves shivani";
        System.out.print("enter:");
        String s1=sc.nextLine();
        System.out.print(s1);
        System.out.println();
        System.out.print("enter:");
        String s2=sc.nextLine();

        System.out.print(s2);
        System.out.println();
        System.out.print(s);
        System.out.println();
        char[]arr={'f','c'};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
