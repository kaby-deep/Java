//program to convert infix to postfix
import java.util.*;
 public class fix
 {
     String infix;
     String postfix;
     
     public fix()
     {
         infix="";
         postfix="";
     }
     public static Scanner sc=new Scanner(System.in);
     void enter()
     {
         System.out.print("Enter a infix expression: ");
         infix=sc.next();
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
     
     void convert()
     {
         Stack<Character> st=new Stack<Character>();
         
         for(int i=0;i<infix.length();i++)
         {
             char c=infix.charAt(i);
             if(Character.isLetter(c))
             {
                 postfix+=c;
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
                     postfix+=st.pop();
                     
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
                             postfix+=st.pop();
                         }
                         st.push(c);
                     }
                 }
             }
         }
         
         while(!st.empty())
         {
             postfix+=st.pop();
         }
     }
     void disp()
     {
         System.out.println("Infix Expression is: "+infix);
         System.out.println("Postfix Expression is: "+postfix);
     }
     public static void main()
     {
         fix ob=new fix();
         ob.enter();
         ob.convert();
         ob.disp();
     }
 }