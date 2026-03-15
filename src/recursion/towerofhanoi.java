package recursion;
import java.util.Scanner;
public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("no of slates:");
        int n=sc.nextInt();
        hanoi(n,'A','B','C');


    }
    public static void hanoi(int n,char src,char helper,char dest){
        if(n==0) return;
        hanoi(n-1,src,dest,helper);//source, helper, destination as a b c // A to B via C//via-mid
        System.out.println(src+" --> "+dest);
        hanoi(n-1,helper,src,dest);// B to C via A
    }

}
