import java.util.*;
public class reduction{
public static String reduce(String s)
{
    StringBuffer sb=new StringBuffer(s);
    for(int i=1;i<sb.length();i++)
    {
        if(sb.charAt(i)==sb.charAt(i-1))
        {
            sb.delete(i-1,i+1);
            i=0;
        }
    }
    String ret="";
    if(sb.length()==0)
    ret="Empty String";
    else
    ret=sb.toString();
    
    return ret;
}

public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String to be reduced: ");
    String cac=reduce(sc.next());
    System.out.println("\n"+"Reduced String is: "+cac);
}
}