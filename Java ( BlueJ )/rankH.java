import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class rankH {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        ArrayList<Integer> sco=new ArrayList<Integer> ();
        
       
        int arr2[]=new int[alice.length];
        
        for(int i=0;i<scores.length;i++)
        {
            sco.add(scores[i]);
        }
        
        for(int i=0;i<alice.length;i++)
        {
            for(int j=sco.size()-1;j>=0;j--)
            {
                if(alice[i]<=sco.get(j))
                {
                    sco.add(j+1,alice[i]);
                    break;
                }
                if(alice[i]>sco.get(0))
                {
                    sco.add(0,alice[i]);
                    break;
                }
            }
            
            int temp1=sco.get(0),temp2=1;
            for(int i1=0;i1<sco.size();i1++)
            {
              if(sco.get(i1)<temp1)
              {
                temp2++;
                temp1=sco.get(i1);
              }
              if(alice[i]==sco.get(i1))
              {
                  arr2[i]=temp2;
              }
            }
            
           
        }
        return arr2;
    }

   

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int s=sc.nextInt();
        int scores[]=new int[s];
        for(int i=0;i<s;i++)
        scores[i]=sc.nextInt();
        
        int a=sc.nextInt();
        int alice[]=new int[a];
        
        for(int i=0;i<a;i++)
        alice[i]=sc.nextInt();

        int ans[]= climbingLeaderboard(scores,alice);

        for(int i=0;i<a;i++)
        System.out.println(ans[i]);
    }
}