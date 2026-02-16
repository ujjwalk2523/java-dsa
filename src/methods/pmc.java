package methods;
import java.util.Scanner;
public class pmc {
    public static void main(String[] args) {
        System.out.print("nCr:");
        System.out.println(nCr(8,3));
        System.out.print("nPr:");
        System.out.println(nPr(8,3));

    }
    public static int nCr(int n,int r){
        Scanner sc=new Scanner(System.in);
        int factn=1;
        int factr=1;
        int factnr=1;

        for(int i=1;i<=n;i++){
            factn=factn*i;
        }
        for(int i=1;i<=r;i++){
            factr=factr*i;
        }
        for(int i=1;i<=(n-r);i++){
            factnr=factnr*i;
        }
        return factn/(factr*(factnr));
    }
    public static int nPr(int n,int r) {
        int factn=1;
        int factr=1;
        int factnr=1;

        for(int i=1;i<=n;i++){
            factn=factn*i;
        }
        for(int i=1;i<=r;i++){
            factr=factr*i;
        }
        for(int i=1;i<=(n-r);i++){
            factnr=factnr*i;
        }
        return factn/factnr;
    }

}
