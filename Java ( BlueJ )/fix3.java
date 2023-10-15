//converting an postfix expression to infix expression

import java.util.*;
public class fix3
{
    String postfix;
    String infix;
    
    public fix3()
 
    {
        postfix="";
        infix="";
    }
    
    void enter()
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter postfix expression: ");
       postfix=sc.next();
    }
    
    void convert()
    {
        Stack<String> st=new Stack<String>();
        for(int i=0;i<postfix.length();i++)
        {
            char c=postfix.charAt(i);
            
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
            {
               String c2=st.pop();
               String c1=st.pop();
               String c3="("+c1+String.valueOf(c)+c2+")";
               st.push(c3);
            }
            else
            {
                st.push(String.valueOf(c));;
            }
        }
        
        infix=st.pop();
    }
    
    void display()
    {
        System.out.print("\n");
        System.out.println("Postfix expression is: "+postfix);
        System.out.println("Infix equivalent of the expression is: "+infix);
    }
    
    public static void main()
    {
        fix3 ob=new fix3();
        ob.enter();
        ob.convert();
        ob.display();
    }
}