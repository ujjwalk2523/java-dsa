package oops;
import java.util.Scanner;

public class finalandstatic {
   static class cricketer{
        final String country="india";
        int jersey;
    }
    public  static void main(String[]args){
        cricketer c1=new cricketer();
        c1.jersey=6;
        System.out.println(c1.jersey+" "+c1.country);
        cricketer c2=new cricketer();
        c2.jersey=1;
        System.out.println(c2.jersey+" "+c2.country);
    }


}
