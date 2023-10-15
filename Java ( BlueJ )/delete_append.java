
import java.util.*;
public class delete_append
{
    String s,t;
    int k;
    public delete_append()
    {
        s="";
        t="";
        k=0;
    }
    
    public String cheq(String s,String t,int k)
    {
        int c1=0;
        int c2=0;
        int i=0;
        while(i>=0)
        {
            try
            {
                if(s.charAt(i)==t.charAt(i))
                {
                    i++;
                    c1++;
                    c2++;
                }
                else
                {
                    break;
                }
            }
            catch(Exception e)
            {
                break;
            }
        }
        int op=(s.length()-c1)+(t.length()-c2);
        String ans="";
        if(op<=k)
        ans="Yes";
        else
        ans="No";
        
        return ans;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string :");
        String s=sc.next();
        System.out.print("enter desired string :");
        String t=sc.next();
        System.out.print("enter func num :");
        int k=sc.nextInt();
        delete_append ob=new delete_append();
        System.out.println(ob.cheq(s,t,k));
        
    }
}