import java.util.*;
public class tree
{
    public static void main()
    {
        TreeSet<Integer> trs=new TreeSet<Integer>();
        trs.add(10);
        trs.add(20);
        trs.add(30);
        trs.add(10);
        System.out.println(trs);
        System.out.println(trs.first());
        System.out.println(trs.last()); 
        trs.pollFirst();
        System.out.println(trs);
        trs.pollLast();
         System.out.println(trs);
    }
}