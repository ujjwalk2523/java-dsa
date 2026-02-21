package array;
import java.util.Arrays;
import java.util.Scanner;
public class shallowanddeep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //shallow copy
        int[]a={3,4,5,6,7};
        int []x=a;
        x[3]=500;
        System.out.println(x[3]);
        x[3]=6;
        //deep copy
        /*int[]b=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[3]=500;
        System.out.println(b[3]);
        System.out.println(a[3]);*/

        int [] deep=Arrays.copyOf(a,a.length);
        deep[3]=600;
        System.out.println(deep[3]);
        System.out.println(a[3]);

    }
}
