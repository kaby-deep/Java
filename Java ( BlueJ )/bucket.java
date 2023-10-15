//program illustraing bucket sort
//Complexity Best: Ω(n+k) Average: θ(n+k) Worst: O(n^2)
import java.util.*;
public class bucket
{ 
    static int n;
    static float arr[];
    
    public bucket()
    {
        n=0;
    }
    
    public static Scanner sc=new Scanner(System.in);
    
    void sort()
    {
        Vector<Float>[] buk=new Vector[n];
        //generating buckets for each position
        for(int i=0;i<n;i++)
        {
            buk[i]=new Vector<Float>();
        }
        //placing elements in their places
        for(int i=0;i<n;i++)
        {
            float indx=arr[i]*n;
            buk[(int)indx].add(arr[i]);
        }
        //sorting eack buckets
        for(int i=0;i<n;i++)
        {
            Collections.sort(buk[i]);
        }
        //placing all elements back
        int pos=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<buk[i].size();j++)
            {
                arr[pos]=buk[i].get(j);
                pos++;
            }
        }
    }
    
    void entry()
    {
        System.out.print("Enter size of array: ");
        n=sc.nextInt();
        arr=new float[n];
        System.out.println("Enter float values less than 1.00.\n");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value: ");
            arr[i]=sc.nextFloat();
            if(arr[i]>=1)
            {
                System.out.println("Error in input !! Press '1' to re-enter value or Press '0' to exit.\n");
                if(sc.nextInt()==0)
                System.exit(0);
                else
                {
                    System.out.print("Re-enter value: ");
                    arr[i]=sc.nextFloat();
                }
            }
        }
    }
    
    void disp()
    {
        System.out.println("Ascending order sorted...");
        for(int i=0;i<n-1;i++)
        {
            char c='\0';
            if(arr[i]<arr[i+1])
            c='<';
            else
            c='=';
            System.out.print(arr[i]+" "+c+" ");
        }
        System.out.print(arr[n-1]);
    }
    
    public static void main()
    {
        bucket ob=new bucket();
        ob.entry();
        ob.sort();
        ob.disp();
    }
}