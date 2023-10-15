//program illustraing merge sort
//Complexity Best: Ω(n log(n)) Average:    θ(n log(n)) Worst: O(n log(n))
import java.util.*;
public class merge
{
    static int arr[],n;
    
    public merge()
    {
        n=0;
    }
    
    void merge(int arr[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i]=arr[m+i+1];
        }
        //arranging elements from both arrays L[] & R[] into the array arr[] by comparison.
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
               arr[k]=L[i];
               i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        //adjusting all remaining (if any) to the array arr[].
        while(i<n1)
        {
            arr[k]=L[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            k++;
            j++;
        }
    }
    
    void sort(int arr[], int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            merge(arr,l,m,r);
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
        merge ob=new merge();
        ob.entry();
        ob.sort(arr,0,n-1);
        ob.disp();
    }
}