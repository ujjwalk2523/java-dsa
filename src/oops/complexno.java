package oops;
import java.util.Scanner;
public class complexno {
   static class complexnumber{
        double x;
        double y;
        void print(){
            if(y>0){
                System.out.println(x+"+"+y+"i");
            }
            else{
                System.out.println(x+""+y+"i");
            }
        }
        complexnumber(double x,double y){
            this.x=x;
            this.y=y;
        }
       public void add(complexnumber z2){
            this.x=x+z2.x;
            this.y=y+z2.y;
       }
        void multiply(complexnumber z2){
            double real=(x*z2.x)-(y*z2.y);
            double img=(x*z2.y)+(y*z2.x);
            this.x=real;
            this.y=img;

       }
       void divide(complexnumber z2){
            double real=((x*z2.x)+(y*z2.y))/((z2.x*z2.x)+(z2.y*z2.y));
            double img=((y*z2.x)-(x*z2.y))/((z2.x*z2.x)+(z2.y*z2.y));
            this.x=real;
            this.y=img;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        complexnumber z1=new complexnumber(2,5);
        complexnumber z2=new complexnumber(3,7);
        z1.print();
        z1.add(z2);
        z1.print();

        z1.multiply(z2);
        z1.print();

        z1.divide(z2);
        z1.print();

    }

}
