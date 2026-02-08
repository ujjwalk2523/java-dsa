package If_else;
import java.util.Scanner;
public class Smaller69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int mag;
        if(n<0){
            mag = -n;
        }
        else {
            mag = n;
        }

         if(mag<69) System.out.println("magnitude less than 69");
        else if(mag>69) System.out.println("magnitude greater than 69");
        else System.out.println("equal magnitude");

        }

    }

