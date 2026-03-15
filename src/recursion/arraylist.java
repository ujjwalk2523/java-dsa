package recursion;
import java.util.*;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String>al=new ArrayList<>();
        al.add("ujjwal");
        al.add("shivani");
        al.add("shristi");

        change(al);
        System.out.print(al);

    }
    public static void change(ArrayList<String> al){
        al.add("kajal");
        al.add("tanvi");
    }
}
