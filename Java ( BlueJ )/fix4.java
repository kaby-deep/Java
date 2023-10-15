//converting an infix expression to infix expression

import java.util.*;
public class fix4
{
    String prefix;
    String infix;
    
    public fix4()
 
    {
        prefix="";
        infix="";
    }
    
    void enter()
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter prefix expression: ");
       prefix=sc.next();
    }
    
    void convert()
    {
        Stack<String> st=new Stack<String>();
        for(int i=(prefix.length()-1);i>=0;i--)
        {
            char c=prefix.charAt(i);
            
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
            {
               String c2=st.pop();
               String c1=st.pop();
               String c3="("+c2+String.valueOf(c)+c1+")";
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
        System.out.println("Prefix expression is: "+prefix);
        System.out.println("Infix equivalent of the expression is: "+infix);
    }
    
    public static void main()
    {
        fix4 ob=new fix4();
        ob.enter();
        ob.convert();
        ob.display();
    }
}