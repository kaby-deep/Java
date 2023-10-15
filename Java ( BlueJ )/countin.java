import java.util.*;
public class countin
{
    static int arr[];
    static String str;
    
    public countin()
    { 
        str="";
    }
    public static Scanner sc=new Scanner(System.in);
    void entry()
    {
        System.out.print("Enter word: ");
        str=sc.nextLine();
    }
    
    void sort(String str)
    {
        arr=new int[256];
        for(int i=0;i<256;i++)
        arr[i]=0;
        
        for(int i=0;i<256;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==(char)i)
                {
                    arr[i]++;
                }
            }
        }
        
        for(int i=0;i<256;i++)
        {
            if(arr[i]!=0)
            for(int j=1;j<=arr[i];j++)
            System.out.print((char)i+" ");
        }
    }
    
    public static void main(String args[])
    {
        countin ob=new countin();
        ob.entry();
        ob.sort(str);
    }
}