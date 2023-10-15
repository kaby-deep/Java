//program illustraing insertion sort
//Complexity  Best: Ω(n)	  Avg: θ(n^2)	Worst: O(n^2)
import java.util.*;
public class insertion
{
    int arr[];
    int n;
    
    public insertion()
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
        for(int i=1;i<n;i++)                 //each element as a key
        {
            int j=i-1;
            int key=arr[i];                 
            while(j>=0 && arr[j]>key)    //checking all prev and swapping where needed
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
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
        insertion ob=new insertion();
        ob.entry();
        ob.sort();
        ob.disp();
    }
}