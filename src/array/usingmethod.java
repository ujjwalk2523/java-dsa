package array;
import java.util.Scanner;
public class usingmethod {
    public static void main(String[] args) {
        int x[]={3,4,5,6,7};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }
    public static void change(int y[]){
        y[3]=100;
    }
}
