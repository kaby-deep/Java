//Microsoft interview problem

import java.util.*;
public class dupl
{
    String s;
    public dupl()
    {
        s="";
    }
    void entr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        s=sc.next();
    }
    void rem()
    {
        int fx=s.length();
        for(int i=0;i<fx;i++)
        {
            int flg=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                flg=1;
            }
            if(flg==0)
            s+=s.charAt(i);
        }
        System.out.println(s.substring(fx,s.length()));
    }
    public static void main()
    {
        dupl ob=new dupl();
        ob.entr();
        ob.rem();
    }
}