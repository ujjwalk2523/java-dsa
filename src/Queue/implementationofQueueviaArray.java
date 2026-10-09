package Queue;
class Queue{
    int[] arr;
    int f;
    int r;
    int size;
    Queue(int len){
        arr = new int[len];
        f=0;
        r=0;
        size=0;
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r == arr.length) {
            r = 0;
        }
            size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontval=arr[f];
        f++;
        if(f==arr.length){
            f=0;
        }
        size--;
        return frontval;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        return arr[f];
    }
    void display(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class implementationofQueueviaArray {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        int []a=q.arr;
        System.out.print("arr is:");
        for(int ele:a){
            System.out.print(ele+" ");
        }

    }


}
