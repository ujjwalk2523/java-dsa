package recursion;
import java.util.*;
import java.util.Scanner;
public class powerset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String s=sc.nextLine();

        ArrayList <String> al=new ArrayList<>();

        subsets("",s,0,al);
        Collections.sort(al);
        System.out.print(al);

    }
    public static void subsets(String ans,String s,int idx,ArrayList <String> al) {
        if (idx == s.length()) {
            if (ans.length() != 0) {
                al.add(ans);
            }
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans + ch, s, idx + 1, al);//pick
        subsets(ans, s, idx + 1, al);//skip

    }
}
