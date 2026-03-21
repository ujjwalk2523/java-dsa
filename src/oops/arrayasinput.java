package oops;
import java.util.Scanner;
public class arrayasinput {
    public static class studentdata{
        String name;
        int rno;
        int []marks;
        studentdata(int[]s){
            marks=s;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={4,5,6,7};
        studentdata s1=new studentdata(arr);
        System.out.println(s1.marks[0]+" "+s1.marks[1]+" "+s1.marks[2]);

    }

}
