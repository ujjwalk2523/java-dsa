package oops;
import java.util.Scanner;
public class constuctorthis {
    public static class car{
        int price;
        String name;
        car(){
        }
        car(int price,String name){
            this.price=price;
            this.name=name;
        }
        void print(){
            System.out.println(this.name+" "+this.price);
        }
    }
    public static void main(String[] args) {
        car c1=new car(1250000,"suv");
        c1.print();

    }
}
