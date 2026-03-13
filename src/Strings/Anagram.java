package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    //anagram mtlb rearrange and make a jumble which is new word
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string 1:");
        String s1=sc.nextLine();
        System.out.print("enter string 2:");
        String s2=sc.nextLine();
         boolean result=anagram(s1 , s2);
        System.out.print(result);

    }
    public static boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;


    }
}
