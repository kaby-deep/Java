//program to print catalan numbers using BigInteger Class
//it displays n catalan numbers with exact precision
//input 10000 and fry your cpu
import java.util.*;
import java.math.BigInteger; 
public class catalan2
{
    String n;
    
    public catalan2()
    {
        n="";
    }
    
    BigInteger factorial(BigInteger x)
    {
        BigInteger ans=new BigInteger("1");
        BigInteger i=new BigInteger("1");
        while(i.compareTo(x)<=0)
        {
            ans=ans.multiply(i);
            BigInteger j=new BigInteger("1");
            i=i.add(j);
        }
        return ans;
    }
    
    void cat()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 'n' for n catalan numbers: ");
        String st=sc.next();
        
        BigInteger r=new BigInteger(st);
        BigInteger i2=new BigInteger("1");
        System.out.println("\n");
        System.out.println("The series of catalan numbers is: ");
        while(i2.compareTo(r)<=0)
        {
           BigInteger count=new BigInteger("1");
           BigInteger j1=new BigInteger("2");
           j1=j1.multiply(i2);
           
           BigInteger j2=new BigInteger("1");
           j2=i2.add(count);
           
           BigInteger j3=new BigInteger("1");
           j3=j3.multiply(factorial(j1).divide((factorial(j2).multiply(factorial(i2)))));
           
           System.out.print(j3+"  ");
           
           i2=i2.add(count);
        }
    }
    
    public static void main(String args[])
    {
        catalan2 ob=new catalan2();
        ob.cat();
    }
}