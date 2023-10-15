//program to print n catalan numbers(using Decimal)
//it displays numbers with decimal pts. and large numbers with Exponential(E) symbol
import java.util.*;
public class catalan
{
    int n;
    
    public catalan()
    {
        n=0;
    }
    
    double factorial(int x)
    {
        double ans=1.0;
        for(int i=1;i<=x;i++)
        {
            ans*=i;
        }
        return ans;
    }
    
    void cat()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' for n-Catalan numbers: ");
        int c=sc.nextInt();
        System.out.println("\n");
        System.out.println("The series of catalan numbers is: ");
        for(int i=1;i<=c;i++)
        {
            System.out.print((factorial(2*i)/(factorial(i+1)*factorial(i)))+" ");
        }
    }
    
    public static void main(String args[])
    {
        catalan ob=new catalan();
        ob.cat();
    }
}