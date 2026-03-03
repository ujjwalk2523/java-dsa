package array_2D;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4); a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(10); b.add(20); b.add(30); b.add(40); b.add(50);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(10); c.add(20); c.add(30);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
       // System.out.println(arr);
       //   for(int i=0;i<arr.size();i++){
        //    for(int j=0;j<arr.get(i).size();j++){
          //      System.out.print(arr.get(i).get(j)+" ");
          //  }
           // System.out.println();
       // }

        //for each loop
        for(ArrayList<Integer> list : arr){
            for(int ele:list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
