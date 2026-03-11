package Strings;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string:");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                count++;
                System.out.print(ch+" ");
            }
        }
        System.out.println();
        System.out.print("vowels in that strings are:");
        System.out.print(count);

    }
}
