//removes duplicate words from a string
import java.util.*;
import java.io.*;

public class wordup
{
    public static void main(/*String[] args*/)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x=Integer.parseInt(br.readLine());
        
    for(int i=0;i<x;i++)
    {
        String st=br.readLine();
        String arr[]=st.split("\\W");
        String arr2[]=new String[arr.length];
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            int flag=0;
            for(int k=0;k<j;k++)
            {
                if(arr[k].equalsIgnoreCase(arr[j]))
                flag++;
            }
            if(flag==0)
            {
                arr2[count]=arr[j];
                count++;
            }
        }
        String ret="";
        for(int p=(arr2.length-1);p>=0;p--)
        {
            if(arr2[p]!=null)
            {
                if(p!=0)
                ret=" "+arr2[p]+ret;
                if(p==0)
                ret=arr2[p]+ret;
            }
        }
        System.out.println(ret);
    }
}
}
