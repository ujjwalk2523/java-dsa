package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class mostfreqchbysliding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        //sliding window techq
//        int maxfreq=-1;
//        char ans=s.charAt(0);
//        char[]arr=s.toCharArray();
//        Arrays.sort(arr);
//        int i=0;
//        int j=0;
//       while(j<arr.length){
//           if(arr[i]==arr[j]){
//               j++;
//           }
//           else{
//               int freq=j-i;//length dega ye
//               if(freq>maxfreq){
//                   maxfreq=freq;
//                   ans=arr[i];
//               }
//               i=j;
//           }
//       }
//       //for checking last block
//        int freq=j-i;
//       if(freq>maxfreq){
//           maxfreq=freq;
//           ans=arr[i];
//       }
//       System.out.print(ans);
//
//


       //m2 frequency array
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';//or ch-97
            freq[idx]++;
        }
        int maxfreq=0;
        char ans=s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ans=(char)(i+'a');
            }
        }
        System.out.print(ans);
    }
}
