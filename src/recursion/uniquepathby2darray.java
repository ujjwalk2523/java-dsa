package recursion;
import java.util.Scanner;
public class uniquepathby2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int m=sc.nextInt();
        int n=sc.nextInt();
       /* int result=paths(0,0,m-1,n-1);
        System.out.print(result);
    }
    public static int paths(int cr,int cc,int lr, int lc){
        if(cr==lr&&cc==lc)return 1;
        if(cr>lr||cc>lc)return 0;
        int right=paths(cr,cc+1,lr,lc);
        int down=paths(cr+1,cc,lr,lc);
        return right+down;*/

        //m2
        int result=paths(m-1,n-1);
        System.out.print(result);
    }
    public static int paths(int cr,int cc){
        if(cr==0&&cc==0) return 1;
        if(cr<0||cc<0) return 0;
        int right=paths(cr,cc-1);
        int down=paths(cr-1,cc);
        return right+down;
    }
}
