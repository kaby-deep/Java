import java.util.*;
public class String_test
{
    static void main()
    {
        char arr[]={'s','t','r','i','n','g','s'};
        System.out.println(arr);
        String str=new String(arr);
        System.out.println("Printing the Original String: "+str);
        
        char arr2[]=str.toCharArray(); 
        System.out.print(arr2);
    }
}