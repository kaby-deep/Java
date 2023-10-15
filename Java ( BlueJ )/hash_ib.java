import java.util.*;
public class hash_ib
{
    
    public hash_ib()
    {
     
    }
    
    public static void main()
    {
        String name;
        int mark;
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        Enumeration<String> num;
        System.out.println("Enter 5 names and their marks.");
        for(int j=0;j<5;j++)
        {
            System.out.print("Enter name: ");
            name=sc.next();
            System.out.print("Enter marks: ");
            mark=sc.nextInt();
            ht.put(name,mark);
        }
    
    
        System.out.println("Printing all names and their marks.");
        num=ht.keys();
        while(num.hasMoreElements())
        {
            String n=num.nextElement();
            int m=ht.get(n);
            System.out.println("Name: "+n+" Mark: "+m);
        }
    }
    
    
}
