package recursion;
import java.util.Scanner;
public class print1ton {
    /*public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter a number n:");
        int n=sc.nextInt();
        print(1,n);

    }
    public static void print(int x,int n){
        if(x>n)return;
        System.out.print(x+" ");
        print(x+1,n);*/

    //m2
    /*static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        n=sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n){
            return;
        }
        System.out.print(x+" ");
        print(x+1);*/

    //m3
        static int n;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter n:");
            n=sc.nextInt();
            print(n);
        }
       /* public static void print(int n){
            if(n==0)return;
            print(n-1);
            System.out.print(n+" ");

        }*/



        //print n to 1
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }



}
