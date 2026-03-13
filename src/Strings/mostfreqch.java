package Strings;
import java.util.Scanner;
public class mostfreqch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        //m1 brute force
        int maxfreq=-1;
        char ans=s.charAt(0);
        for(int i=0;i<s.length();i++){
            int freq=1;
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++) {
                if (s.charAt(j) == ch) {
                    freq++;
                }
            }
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans=ch;
                }
                else if(freq==maxfreq&&ch<ans){
                    ans=ch;
                }
            }

        System.out.print(ans);
    }
}
