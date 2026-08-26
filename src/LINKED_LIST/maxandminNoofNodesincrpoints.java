package LINKED_LIST;

public class maxandminNoofNodesincrpoints {
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(1);
        Node g=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        int ans[]=solution(a);
        System.out.println("The maximum and minimum number of nodes is: "+ans[1]+" "+ans[0]);
    }
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int[] solution(Node head){
        int []ans={-1,-1};
        int idx=1, firstidx=-1, lastidx=-1, mindist=Integer.MAX_VALUE;
        Node a=head;
        Node b=a.next;
        Node c=b.next;
        if(c==null){
            return ans;
        }
        while(c!=null){
            if((b.val>a.val&&b.val>c.val)||(b.val<a.val&&b.val<c.val)){
                if(firstidx==-1){
                    firstidx=idx;
                }
                if(lastidx!=-1){
                    int dist=idx-lastidx;
                    mindist=Math.min(mindist,dist);
                }
                lastidx=idx;
            }
            idx++;
            a=a.next;
            b=b.next;
            c=c.next;
        }
        int maxDist=lastidx-firstidx;
        if(maxDist==0){
            maxDist=-1;
        }
        if(mindist==Integer.MAX_VALUE){
            mindist=-1;
        }
        ans[0]=mindist;
        ans[1]=maxDist;
        return ans;

    }

}
