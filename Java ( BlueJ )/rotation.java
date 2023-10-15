import java.util.*;
public class rotation 
{
    static Scanner sc=new Scanner(System.in);
    int arr[],n,r;
    public rotation()
    {
        n=0;
        r=0;
    }

    void enter()
    {
        System.out.print("\nEnter the number of Elements: ");
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a number: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("\n\nEnter the number of rotations: ");
        r=sc.nextInt();
        System.out.print("\n");

    }

    void rotate1()
    {
        int temp[]=new int[r];
        for(int i=0;i<r;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=0;i<(n-r);i++)
        {
            arr[i]=arr[i+r];
        }
        int t2=0;
        for(int i=n-r;i<n;i++)
        {
            arr[i]=temp[t2];
            t2++;
        }
    }

    void rotate2()
    {
        for(int i=1;i<=r;i++)
        {
            int temp=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }

    void rotate3()
    {
        int g=gcd.getGCD(n,r);
        //System.out.println("GCD is: "+g);
        int d=-1,temp,j;
        for(int i=0;i<g;i++)
        {
            j=i;
            temp=arr[i];
            while(true)
            {
                d=(j+r)%n;

                if(d==i)
                break;

                arr[j]=arr[d];
                j=d;
            }
            arr[j]=temp;
        }

    }

    void display()
    {
        System.out.print("\n");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println("\n");
    }

    public static void main(String args[])
    {
        rotation ob=new rotation();
        ob.enter();
        ob.display();
       //ob.rotate1();
       // ob.display();
        ob.rotate3();
        ob.display();
    }
}
    