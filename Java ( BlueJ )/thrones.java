//checks if the string is an anagram of a palindrome string
//example aaabbbb returns true, aaabbb returns false, aabb returns true, bbbb returns true
//odd freq(or zero freq) of a single char is allowed
//freq of all chars can be even,odd freq is allowed for a unique char only
import java.util.*;
class thrones {
    public static String gameOfThrones(String s) {
        char arr[]=new char[s.length()];
        arr=s.toCharArray();
        List<Integer> freq=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]!='.')
            {
                char temp=arr[i];
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(temp==arr[j])
                    {
                        count+=1;
                        arr[j]='.';
                    }
                }
                freq.add(count);
            }
            
        }
        
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<freq.size();i++)
        {
            System.out.print(freq.get(i)+" ");
        }*/
        
        int odd=0;
        String result="";
        for(int i=0;i<freq.size();i++)
        {
            //System.out.print(freq.get(i)+" ");
            if(!(freq.get(i)%2==0))
            odd++;
        }
        if(odd==1||odd==0)
        result="YES";
        else
        result="NO";
        
        return result;
        //System.out.println(result);
    }

}