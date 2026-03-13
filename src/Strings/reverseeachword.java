package Strings;
import java.util.Scanner;
public class reverseeachword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write a sentence:");
        String s=sc.nextLine();
        int start=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)==' '){
                for(int j=i-1;j>=start;j--){
                    System.out.print(s.charAt(j));
                }
                System.out.print(" ");
                start=i+1;
            }

        }

    }
}
