package Queue;
class MyStack{
    java.util.Queue<Integer> q = new java.util.LinkedList<>();
    //add efficient approach
    /*
    public void push(int x){
        q.add(x);

    }
    public int pop(){
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
       return q.remove();
    }
    public int top(){
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
        int p=q.peek();
        q.add(q.remove());
        return p;
    }
    boolean empty(){
        return (q.size()==0);
    }

    */
    
   // pop efficient approach
    public void push(int x){
        q.add(x);
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }

    }
    public int pop(){
        return q.remove();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        return (q.size()==0);
    }

    public void display(){
        int n=q.size();
        for(int i=0;i<n;i++){
            int val=q.remove();
            System.out.print(val+" ");
            q.add(val);
        }
        System.out.println();
    }
}


public class implementationStackusingQueue {
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.empty());
        s.display();
    }

}
