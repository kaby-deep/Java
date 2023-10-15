//program depicts the functioning of hash tables

import java.util.*;
public class hashin
{
    public class con
    {
        String name;
        long num;
        public con(String n,long nu)
        {
            name=n;
            num=nu;
        }
    }
    
    int len;
    con arr[];
    final Scanner sc=new Scanner(System.in);
    public hashin()
    {
        len=0;
    }
    
    void ent()
    {
       System.out.print("Enter array size: ");
       len=sc.nextInt();
       arr=new con[len];
    }
    
    int hash(String s1, int le)
    {
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            sum+=(int)s1.charAt(i);
        }
        return sum%le;
    }
    
    void cycl()
    {
        while(1>0)
        {
            System.out.println("\n"+"Enter"+"\n"+"(1)->to add"+"\n" +"(2) to display"+"\n" +"(3)->to search"+ "\n" +"(0)->to exit");
            int ch;
            ch=sc.nextInt();
        
            if(ch==1)
            {
                System.out.println();
                System.out.print("Enter a name: ");
                String s=sc.next();
                System.out.print("Enter his number: ");
                long n=sc.nextLong();
                
                int pos=hash(s,len);
                con n1=new con(s,n);
                if(arr[pos]==null)
                {
                    arr[pos]=n1;
                    System.out.println("entered successfully");
                }
                else
                {
                    int flg=0;
                    for(int i=pos+1;i<len;i++)
                    {
                        if(arr[i]==null)
                        {
                           arr[i]=n1;
                           System.out.println("entered successfully");
                           flg=1;
                           break;
                        }
                    }
                    if(flg==0)
                    {
                        for(int i=0;i<pos;i++)
                      {
                          if(arr[i]==null)
                          {
                              arr[i]=n1;
                              System.out.println("entered successfully");
                              flg=1;
                              break;
                          }
                      }
                      
                      if(flg==0)
                      {
                         System.out.println("Could not enter !!Array Full");
                      }
                    }
                }
            }
            if(ch==2)
            {
                 System.out.println("Displaying all elements and their numbers:"+"\n");
                 for(int i=0;i<len;i++)
                 {
                     if(arr[i]!=null)
                     {
                          System.out.println("Name-> "+arr[i].name +"\t"+"Number-> "+arr[i].num);
                     }
                 }
            }
            else if(ch==0)
            {
                System.out.println("Ended !!");
                System.exit(0);
            }
            else if(ch==3)
            {
                System.out.print("Enter name you wanna search for: ");
                String s2=sc.next();
                int pos2=hash(s2,len);
                int indx=-1;
                if((arr[pos2].name).equals(s2))
                {
                    System.out.print("-");    //"-" defines the no. of hits
                    System.out.println();
                    System.out.print("Name-> "+arr[pos2].name+"  "+"Number-> "+arr[pos2].num+"\n");
                }
                else
                {
                    int flg=0;
                    for(int i=pos2;i<len;i++)
                    {
                        System.out.print("-");
                        if((arr[i].name).equals(s2))
                        {
                            flg=1;
                            indx=i;
                        }
                    }
                    if(flg==0)
                    {
                        for(int i=pos2;i<len;i++)
                      {
                         System.out.print("-");
                         if((arr[i].name).equals(s2))
                         {
                            flg=1;
                            indx=i;
                         }
                      }
                      if (flg==0)
                        System.out.println("\n"+"No results found !!"+"\n");
                    }
                    if(flg==1)
                    {
                          System.out.println("\n"+"Found !!");
                          System.out.println("Name-> "+arr[indx].name+"  "+"Number-> "+arr[indx].num+"\n");
                          System.out.println("Found at pos: "+(indx+1));
                    }
                }
            }
        }
    }
    
    public static void main()
    {
        hashin obj=new hashin();
        obj.ent();
        obj.cycl();
    }
}
        
                    
                 
        
    
            
        