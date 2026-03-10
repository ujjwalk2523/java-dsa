package array_2D;
import java.util.Scanner;
import java.util.ArrayList;
public class pascals_triangle_arraylists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of levels:");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
              if(j==i || j==0){
                  list.add(1);
              }
              else{
                  int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                  list.add(val);
              }
            }
            arr.add(list);
        }
        for(ArrayList<Integer> list:arr){
            for(int element:list){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }

}
