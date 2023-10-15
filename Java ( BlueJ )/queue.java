import java.util.*;
public class queue
{
    public static void main()
    {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        q.add(20);
        q.add(10);
        //q.add(10);
        q.add(30);
        //System.out.println(q.peek());
        //System.out.println(q);
        //System.out.println(q.poll());
        //System.out.println(q);
        q.add(40);
        //q.element();
        System.out.println(q);
        q.remove(40);
        System.out.println(q);
    }
}