package If_else;
import java.util.Scanner;
public class Profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price:");
        double cp=sc.nextDouble();
        System.out.print("enter selling price:");
        double sp=sc.nextDouble();
        if(cp>sp) System.out.println("loss:"+(cp-sp)+"\nloss percent:"+((cp-sp)/cp)*100);
        else if(sp>cp) System.out.println("profit:"+(sp-cp)+"\ngain percent:"+((sp-cp)/cp)*100);
        else System.out.println("no loss ---- no gain");

    }
}
