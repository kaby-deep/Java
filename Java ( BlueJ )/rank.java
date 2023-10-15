import java.util.*;

public class rank
{
    int scores[],alice[],ans[];
    int sn,an;
    public rank()
    {
         sn=0;
         an=0;
    }
    public void assgn()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter overall score freq: ");
        sn=sc.nextInt();
        System.out.print("Enter alice score freq: ");
        an=sc.nextInt();
        
        scores=new int[sn];
        alice=new int[an];
        
        System.out.println("Enter overall.");
        for(int i=0;i<sn;i++)
        {
            scores[i]=sc.nextInt();
        }
        
        System.out.println("Enter alice.");
        for(int i=0;i<an;i++)
        {
            alice[i]=sc.nextInt();
        }
        System.out.println();
        climbingLeaderboard(scores,alice);
    }
    
    public void climbingLeaderboard(int[] scores, int[] alice) 
    {
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
            
            ArrayList<Integer> rank=new ArrayList<Integer> ();
            int temp1=sco.get(0),temp2=1;
           for(int i1=0;i1<sco.size();i1++)
           {
            if(sco.get(i1)<temp1)
            {
              temp2++;
              temp1=sco.get(i1);
            }
            rank.add(temp2);
           }
           
           for(int k=0;k<sco.size();k++)
           {
               if(alice[i]==sco.get(k))
               arr2[i]=rank.get(k);
           }
           
        }
       
        System.out.print("\n\n");
        System.out.println("Ranking list of Alice:");
        for(int i=0;i<alice.length;i++)
        System.out.print(arr2[i]+" ");
       
       
    }
    public static void main()
    {
        rank ob=new rank();
        ob.assgn();
    }
}