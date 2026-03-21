package oops;
import java.util.Scanner;
public class gettersetter {
    static class ipl{
        String jcolor;
        String tname;
        int wins;
        void setjcolor(String jcolor){
            this.jcolor=jcolor;
        }
        void settname(String tname){
            this.tname=tname;
        }
        void setwins(int wins){
            this.wins=wins;
        }
        String getjcolor(){
            return jcolor;
        }
        String gettname(){
            return tname;
        }
        int getWins(){
            return wins;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ipl i1=new ipl();
        ipl i2=new ipl();
        i1.setjcolor("red");
        i1.setwins(1);
        i1.settname("RCB");
        i2.setjcolor("blue");
        i2.setwins(5);
        i2.settname("MI");
        System.out.print(i1.getjcolor()+"-");
        System.out.println(i1.gettname());
        System.out.print(i2.getjcolor()+"-");
        System.out.println(i2.gettname());
    }

}
