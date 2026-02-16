package methods;
import java.util.Scanner;
public class swap2no {
    public static void main(String[] args) {
        System.out.println(swap(9,7));
    }
    public static int swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        return a;
    }


}
