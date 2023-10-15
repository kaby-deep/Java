//Microsoft interview problems

import java.util.*;
public class linkd_loop
{
    
    public class node
    {
        int data;
        node next;
        node(int h)
        {
            data=h;
            next=null;
        }
    }
    static final Scanner sc=new Scanner(System.in);
    node start;
    linkd_loop()
    {
      start=null;  
    }
    void entry()
    {
        System.out.println("enter nodes: ");
        int p=sc.nextInt();
        start=new node(p);
          node temp=start;
          node nptr=null;
        while(1>0)
        {
            int y=sc.nextInt();
            if(y==0)
            {
                System.out.println("entry complete.");
                break;
            }
            else
            {
               nptr=new node(y);
               temp.next=nptr;
               
               temp=nptr;
            }
        }
    }
    void disp()
    {
        node ptr=start;
        while(ptr.next!=null)
        {
            System.out.print(ptr.data+" --> ");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }
    
    public static void main()
    {
       linkd_loop ob=new linkd_loop();
       ob.entry();
       ob.disp();
       if(ob.loop())
       System.out.print("\n"+"Linked List has a loop inside it.");
    }
    //check if a loop is present
    boolean loop()
    {
        node st=start;
        boolean ans=false;
        LinkedList<Integer> q=new LinkedList<Integer>();
        while(st!=null)
        {
            if(q.contains(st.data))
            {
                ans=true;
                break;
            }
            else
            {
               q.add(st.data);
            }
            st=st.next;
        }
        return ans;
    }
}    