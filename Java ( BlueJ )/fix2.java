//program to convert infix expression to prefix expression
import java.util.*;
public class fix2
{
  String infix;
  String prefix;
  
  public fix2()
  {
      infix="";
      prefix="";
  }
  public static Scanner sc=new Scanner(System.in);
  void enter()
  {
      System.out.print("Enter a infix expression: ");
      infix=sc.next();
      infix=rev(infix);
  }
  
  int pref(char x)
  {
      int p=0;
      //if(x=='(' || x==')')
      //p=4;
      if(x=='^')
       p=3;
      else if(x=='*' || x=='/')
       p=2;
      else if(x=='+' || x=='-')
       p=1;
      else
       p=0;
         
         return p;
  }
  
     void convert2()
     {
         Stack<Character> st=new Stack<Character>();
         
         for(int i=0;i<infix.length();i++)
         {
             char c=infix.charAt(i);
             if(Character.isLetter(c))
             {
                 prefix+=c;
             }
             else if(c=='(')
             {
                 st.push(c);
             }
             else if(c==')')
             {
                 if(st.search('(')==-1)
                 {
                     System.out.println("Invalid Expression !");
                     System.exit(0);
                 }
                 else
                 {
                     while(st.peek()!='(' && !st.empty())
                     prefix+=st.pop();
                     
                     st.pop();
                 }
             }
             else
             {
                 if(st.empty())
                 st.push(c);
                 else
                 {
                     if(pref(st.peek())<pref(c))
                     st.push(c);
                     else
                     {
                         while(!(st.empty()) && (pref(st.peek())>=pref(c)))
                         {
                             prefix+=st.pop();
                         }
                         st.push(c);
                     }
                 }
             }
         }
         
         while(!st.empty())
         {
             prefix+=st.pop();
         }
         
         prefix=rev(prefix);
     }
     
     void disp()
     {
         System.out.println("Infix Expression is: "+infix);
         System.out.println("Prefix Expression is: "+prefix);
     }
     
     String rev(String s)
     {
         String st="";
         for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
             if(c=='(')
             c=')';
             else if(c==')')
             c='(';
             st=c+st;
         }
         return st;
     }
     
     public static void main()
     {
         fix2 ob=new fix2();
         ob.enter();
         ob.convert2();
         ob.disp();
     }
  
}