//program illustraing quick sort
//Complexity Best: Ω(n log(n)) Average:	θ(n log(n)) Worst: O(n^2)
import java.util.*;
public class quick
{
    static int arr[];
    static int n;
    
    public quick()
    {
       n=0; 
    }
    
    int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        //placing all elements less than pivot to the left
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //placing pivot next to the elements less than it
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        //returning new pivot position
        return i+1;
    }
    
    void sort(int arr[],int low,int high)
    {
        if(low<high)
        {
            //first partition(default)
            int pi=partition(arr,low,high);
            //recursive sorting partitions left and right to the pivot
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
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
        quick ob=new quick();
        ob.entry();
        ob.sort(arr,0,n-1);
        ob.disp();
    }
}