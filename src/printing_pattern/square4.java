package printing_pattern;
import java.util.Scanner;
public class square4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }

    }
}
