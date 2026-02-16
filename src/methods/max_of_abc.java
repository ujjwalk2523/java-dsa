package methods;

import java.util.Scanner;

public class max_of_abc {
    public static void main(String[] args)
    {
        System.out.println(max(3,4,5));
    }
    public static int max(int a,int b,int c){
        if(a>b && a>c)return a;
        else if(b>a && b>c)return b;
        else return c;
    }
}
