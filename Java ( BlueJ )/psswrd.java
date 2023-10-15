//program to guess the password

import java.math.*;
import java.util.*;
public class psswrd
{
    String st;
    public psswrd()
    {
        st="";
    }
    
    void entry()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 5-character Password: ");
        st=sc.next();
        if(st.length()!=5)
        {
            System.out.println("Error Input !!");
            System.exit(0);
        }
        st.toLowerCase();
        System.out.println();
    }
    
    void guess()
    {
       int f1=0;
       BigInteger hits=new BigInteger("0");
       BigInteger one=new BigInteger("1");
       for(int h=97;h<=122;h++){
        for(int i=97;i<=122;i++){
         for(int j=97;j<=122;j++){
          for(int k=97;k<=122;k++){
           for(int l=97;l<=122;l++){
            String tmp=(Character.toString((char)h))+(Character.toString((char)i))+(Character.toString((char)j))+(Character.toString((char)k))+(Character.toString((char)l));
            if(tmp.equals(st))
            {
             f1=1;
             hits=hits.add(one);
             
             System.out.println();
             System.out.println("Password is: "+tmp);
             System.out.println("Number of hits: "+hits);
            }
            else
            {
                hits=hits.add(one);
            }
                        
            if(f1==1)
             break;
           }
           
           if(f1==1)
            break;
          }
                
          if(f1==1)
           break;
         }
            
         if(f1==1)
          break;
        }
        
        if(f1==1)
          break;
       }
    }
    
    public static void main()
    {
        psswrd ob=new psswrd();
        ob.entry();
        ob.guess();
    }
}
