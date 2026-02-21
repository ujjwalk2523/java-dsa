package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class vector_array_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(30);
        arr.add(35);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.get(0));//no arr[0]
        System.out.println(arr);
        System.out.println(arr.set(3,45));    //no arr[3]=45
        System.out.println(arr);
        int n=arr.size();//arr.length
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");}
        System.out.println();
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        System.out.println();
            arr.add(78);
            arr.add(1,100);
            System.out.println(arr);
            arr.remove(arr.size()-1);
            System.out.println(arr);
            Collections.reverse(arr);
            System.out.println(arr);
        int j=0;
        int k=arr.size()-1;
        while(j<k){
            int temp=arr.get(j);
            arr.set(j,arr.get(k));
            arr.set(k,temp);
            j++;
            k--;
        }
        System.out.println(arr);


        }

    }

