//program illustraing selection sort
//Complexity Best: Ω(n^2)    Avg: θ(n^2)    Worst: O(n^2)

import java.util.*;
public class selection
{
    int arr[];
    int n;
    
    public selection()
    {
        n=0;
    }
    
    public static Scanner sc=new Scanner(System.in);
    
    void entry()
    {
        System.out.print("Enter the length of array: ");
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
        for(int i=0;i<(n-1);i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[i])
                { 
                  int temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
                }
            }
        }
    }
    
    void disp()
    {
        System.out.println("Incresing order sorted....");
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
        selection ob=new selection();
        ob.entry();
        ob.sort();
        ob.disp();
    }
}