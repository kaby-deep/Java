
//need more time on this
import java.util.*;
public class heap
{
    int arr[];
    int n;
    
    public heap()
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
    
    void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int left=(i*2)+1;
        int right=(i*2)+2;
        
        if(left<n && arr[largest]<arr[left])
        largest=left;
        
        if(right<n && arr[largest]<arr[right])
        largest=right;
        
        if(largest!=i)
        {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            
            heapify(arr,n,largest);
        }
    }
    
    void sort()
    {
        for(int i=(n/2)-1;i>=0;i--)
            heapify(arr,n,i);
            
        for (int i = n - 1; i > 0; i--) 
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        
            heapify(arr,i,0);
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
        heap ob=new heap();
        ob.entry();
        ob.sort();
        ob.disp();
    }
}