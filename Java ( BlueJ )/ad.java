import java.util.*;
public class ad
{
    public static void main()
    {
        ArrayDeque<Integer> ar=new ArrayDeque<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        System.out.println(ar);
        ar.addFirst(0);
        ar.addLast(999);
        System.out.println(ar);
    }
}