package recursion;
import java.util.Scanner;
public class power {
    //m1

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        int result=pow(a,b);
        System.out.print("result:"+result);
    }/*
        public static int pow(int a,int b){
        if(b==0)return 1;
        return a*pow(a,b-1);
    }*/

    //m2
    public static int pow(int a,int b){
        if(b==0)return 1;
        int call=pow(a,b/2);
        if(b%2==0)return call*call;
        else return a*call*call;
    }




}
