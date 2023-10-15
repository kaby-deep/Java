//stack using linked list
import java.util.*;
public class stack2
{
    
    class node
    {
        int data;
        node next;
        node prev;
        
        public node()
        {
            data=0;
            next=prev=null;
        }
    }
    
    node start;
    node top;
    public stack2()
    {
        start=top=null;
    }
    
    void push(int x)
    {
        if(start==null)
        {
            start=new node();
            start.data=x;
            top=start;
            
            System.out.println("Pushed to stack.");
        }
        else
        {
            node nptr=new node();
            nptr.data=x;
            nptr.prev=top;
            top.next=nptr;
            top=nptr;
            
            System.out.println("Pushed to stack.");
        }
    }
    
    void pop()
    {
        if(top==start)
        {
            System.out.println(start.data+" deleted.");
            start=null;
            top=null;
        }
        else if(top==null)
        System.out.println("Underflow !");
        else
        {
            System.out.println(top.data+" deleted.");
            top=top.prev;
        }
    }
    
    void disp()
    {
        node ptr=top;
        while(ptr.prev!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.prev;
        }
        System.out.print(ptr.data);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        stack2 ob2=new stack2();
        
        while(1>0)
       {
           System.out.println("\n");
           System.out.println("Enter 1->Push 2->Pop, 3->Dispaly 0->Exit");
           int c=sc.nextInt();
           if(c==1)
           {
               System.out.println("Enter value you wanna push to stack: ");
               ob2.push(sc.nextInt());
           }
           else if(c==2)
           {
               ob2.pop();
           }
           else if(c==3)
           {
               ob2.disp();
           }
           else if(c==0)
           System.exit(0);
       }
    }
}