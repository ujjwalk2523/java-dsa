package Strings;
import java.util.Scanner;
public class nonrepeatingch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        int[] freq=new int[26];
        //count frequency
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        //find first non repeating character
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                System.out.print(ch);
                break;
            }
        }


    }
}
