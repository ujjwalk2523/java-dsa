package Strings;
import java.util.Scanner;
public class sumallsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String str=sc.nextLine();
        long sum=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                sum=sum+Long.parseLong(sub);


            }
        }
        System.out.print(sum);

    }
}
