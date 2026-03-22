package oops;
import java.util.Scanner;
public class methodallfunction {
    public static class cricket{
        Scanner sc=new Scanner(System.in);
        String name;
        double avg;
        int jersey;
        void print(){
            System.out.println("player details....");
            System.out.println(name+" "+avg+" "+jersey);

        }
    }
    public static void main(String[] args){
        cricket c1=new cricket();
        c1.name="vk";
        c1.avg=53.5;
        c1.jersey=18;

        cricket c2=new cricket();
        c2.name="rohit";
        c2.avg=43.5;
        c2.jersey=45;
        c1.print();
        c2.print();
    }

}
