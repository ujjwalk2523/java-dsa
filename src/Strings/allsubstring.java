package Strings;
import java.util.Scanner;
public class allsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();
        for(int j=0;j<=str.length();j++) {
            for (int i = j+1; i <= str.length(); i++) {
                System.out.print(str.substring(j,i) + " ");
            }
        }
    }
}
