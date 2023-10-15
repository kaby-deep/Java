//program illustraing bubble sort
//Complexity Best: Ω(n)    Avg: θ(n^2)    Worst: O(n^2)
import java.util.*;
public class bubble
{
    int arr[];
    int n;
    
    public bubble()
    {
        n=0;
    }
    public static Scanner sc=new Scanner(System.in);
    void entry()
    {
        System.out.print("Enter size of array: ");
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value: ");
            arr[i]=sc.nextInt();
        }
    }
    
    void sort()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]+arr[j+1];                      //x=x+y
                    arr[j+1]=arr[j]-arr[j+1];                    //y=x-y
                    arr[j]=arr[j]-arr[j+1];                      //x=x-y;
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
    
    public static void main(String args[])
    {
        bubble ob=new bubble();
        ob.entry();
        ob.sort();
        ob.disp();
    }
}