import java.util.*;

public class stix
{
  public static void main()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("size:");
    int len=0;
    int arr[]=new int[len=sc.nextInt()];
    
    for(int i=0;i<len;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    ArrayList<Integer> a1=new ArrayList<Integer>();
    ArrayList<Integer> a2=new ArrayList<Integer>();
    for(int i=0;i<len;i++)
    {
        a1.add(arr[i]);
        
    }
    
    while(!(a1.isEmpty()))
    {
        a2.add(a1.size());
        int min=a1.get(0);
        for(int i=0;i<a1.size();i++)
        {
           if(a1.get(i)<min)
           min=a1.get(i);
        }
        
        for(int i=0;i<a1.size();i++)
        {
            a1.set(i,(a1.get(i)-min));
        }
        
        ArrayList<Integer> a0=new ArrayList<Integer>(1);
        a0.add(0);
        
        for(int i=0;i<a1.size();i++)
        {
            if(a1.get(i)==0)
            {
                a1.removeAll(a0);
            }
        }
        
        
    }
    
    for(int i=0;i<a2.size();i++)
    {
       System.out.println(a2.get(i)); 
    }
    
  }
}

        
    
    