import java.util.*;

public class jump2
{
    int arr[];
    int n;
    int leap;
    public Scanner sc=new Scanner(System.in);
    public jump2()
    {
        n=0;
        leap=0;
    }
    void entry()
    {
        System.out.print("Enter number of test cases: ");
        n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
          System.out.print("Enter size of array: ");
          int len=sc.nextInt();
          arr=new int[len];
          System.out.print("Enter the leap value: ");
          leap=sc.nextInt();
          System.out.println("Enter values (0&1) to the array.");
          for(int i=0;i<len;i++)
           {
               arr[i]=sc.nextInt();
           }
          if(canWin(arr,leap,0))
          System.out.println("YES");
          else
          System.out.println("NO");
        }
    }
    
    boolean canWin(int arr[],int leap,int pos)
    {
        //base cases
        if(pos>=arr.length)
        return true;
        else if(pos<0 || arr[pos]==1)
        return false;
        
        arr[pos]=1; //visited
        
        return canWin(arr,leap,pos+leap) || canWin(arr,leap,pos+1) || canWin(arr,leap,pos-1);
    }
    
    public static void main()
    {
        jump2 ob1=new jump2();
        ob1.entry();
    }
}