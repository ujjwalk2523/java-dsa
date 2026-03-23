package oops;
import java.util.Scanner;
public class fraction {
    int num;
    int den;
    fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+den);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        fraction f1=new fraction(3,7);
        f1.print();//print
        fraction f2=new fraction(2,5);
        f1.add(f2);
        f1.print();//print
        f1.multiply(f2);
        f1.print();//print
        f1.divide(f2);
        f1.print();//print

    }
    void add(fraction f){
        num=(num*f.den)+(den*f.num);
        den*=f.den;
        simplify();
    }
    void multiply(fraction f){
        num=num*f.num;
        den=den*f.den;
        simplify();
    }
    void divide(fraction f){
        num=num*f.den;
        den=den*f.num;
        simplify();
    }
    void simplify(){
        boolean isnegative=(num*den<0)?true:false;
        num=Math.abs(num);
        den=Math.abs(den);
        int gcd=hcf(num,den);
         num=num/gcd;
         den=den/gcd;
        if(isnegative){
            num=-num;
        }

    }
    int hcf(int a, int b){
        if(a==0)return b;
        return hcf(b%a,a);
    }
}




