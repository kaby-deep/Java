//stack using array
import java.util.*;
public class stack
{
    int arr[];
    int top;
    int max;
    public stack(int x)
    {
        max=x;
        arr=new int[x];
        top=-1;
    }
    
    void push(int item)
    {
        if(top==-1)
        {
            top=0;
            arr[0]=item;
            System.out.println("Pushed to stack.");
        }
        else if(top==(max-1))
        {
            System.out.println("Overflow !");
        }
        else
        {
            top+=1;
            arr[top]=item;
            System.out.println("Pushed to stack.");
        }
    }
    
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow !");
        }
        else if(top==0)
        {
            top=-1;
            System.out.println(arr[0]+" popped from stack.");
        }
        else
        {
            System.out.println(arr[top]+" popped from stack,");
            top-=1;
        }
    }
    void disp()
    {
        for(int i=top;i>=0;i--)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of stack: ");
       int s=sc.nextInt();
       stack ob=new stack(s);
       while(1>0)
       {
           System.out.println("\n");
           System.out.println("Enter 1->Push 2->Pop, 3->Dispaly 0->Exit");
           int c=sc.nextInt();
           if(c==1)
           {
               System.out.println("Enter value you wanna push to stack: ");
               ob.push(sc.nextInt());
           }
           else if(c==2)
           {
               ob.pop();
           }
           else if(c==3)
           {
               ob.disp();
           }
           else if(c==0)
           System.exit(0);
       }
    }
}