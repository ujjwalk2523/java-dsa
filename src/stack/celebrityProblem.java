package stack;
import java.util.Scanner;
import java.util.Stack;
public class celebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{0,1,1,1,1},{0,0,0,1,0},{1,0,0,1,0},{0,0,0,0,0},{1,1,0,1,0}};
        int ans=solving(arr);
        System.out.println(":"+ans);

    }

    public static int solving(int arr[][]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            boolean aflag = true, bflag = true;
            if (arr[a][b] == 1) {// a toh cel nhi hai
                aflag = false;
            } else {// arr[a][b]==0-- b cel nhi hai
                bflag = false;
            }
            if (arr[b][a] == 1) {//b cel nhi hai
                bflag = false;
            } else {
                aflag = false;
            }
            if (aflag) st.push(a);
            if (bflag) st.push(b);
        }
        if(st.size()==0) return -1;
        int ele=st.pop();
        for(int j=0;j<n;j++){
            if(j==ele)continue;
            if(arr[ele][j]==1){
                return -1;
            }
        }
        for(int i=0;i<n;i++){
            if(i==ele) continue;
            if(arr[i][ele]==0){
                return -1;
            }
        }
        return ele;
    }
}
