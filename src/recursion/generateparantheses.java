package recursion;
import java.util.*;
import java.util.Scanner;
public class generateparantheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        String s="";
        List<String> al=new ArrayList<>();
        generate(n,0,0,"",al);
        System.out.print(al);


    }
    public static void generate(int n,int left,int right,String s,List<String> al){
        if(right==n){
            al.add(s);
            return;
        }
        if(left<n)generate(n,left+1,right,s+"(",al);
        if(right<left)generate(n,left,right+1,s+")",al);

    }
}
