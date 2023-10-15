
import java.util.*;
public class bird
{
    public static int check(List<Integer> arr)
    {
        List<Integer> type=new ArrayList();
        List<Integer> freq=new ArrayList();
        int ret=0;
        for(int i=0;i<arr.size();i++)
        {
            if(!(type.contains(arr.get(i))))
            type.add(arr.get(i));
        }
        
        for(int i=0;i<type.size();i++)
        {
            int num=0;
            for(int j=0;j<arr.size();j++)
            {
                if(arr.get(j)==type.get(i))
                {
                    num++;
                }
            }
            freq.add(num);
        }
        
        /*for(int i=0;i<type.size();i++)
        {
            System.out.print(type.get(i));
        }
        System.out.println();
        for(int i=0;i<freq.size();i++)
        {
            System.out.print(freq.get(i));
        }
        System.out.println();
        
        System.out.println(hy);
        System.out.println(num);
        */
        int hy=0;
        int num=0;
        int indx=0;
        for(int i=0;i<freq.size();i++)
        {
            if(freq.get(i)>hy)
            {
                hy=freq.get(i);
                indx=i;
            }
        }
        for(int i=0;i<freq.size();i++)
        {
            if(freq.get(i)==hy)
            num++;
        }
        
        if(num>1)
        {
            List<Integer> type2=new ArrayList();
            
            for(int i=0;i<freq.size();i++)
            {
                if(freq.get(i)==hy)
                {
                   type2.add(type.get(i));
                }
            }
            
            int min=type2.get(0);
            for(int i=0;i<type2.size();i++)
            {
                if(min>type2.get(i))
                min=type2.get(i);
            }
            ret=min;
        }
        else
        {
            ret=type.get(indx);
        }
        
        return ret;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("length: ");
        int n=sc.nextInt();
        
        List<Integer> a=new ArrayList<Integer> ();
        System.out.println("enter values.");
        
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        
        System.out.print("output is: "+check(a));
        
       
    }
}
        