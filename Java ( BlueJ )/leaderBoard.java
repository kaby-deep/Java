import java.util.*;

public class leaderBoard 
{
    public static List<Integer> ranking(List<Integer> ranked,List<Integer> player)
    {
        List<Integer> fin=new ArrayList<Integer>();
        for(int i=0;i<player.size();i++)
        {
            int flag=0;
            for(int j=0;j<ranked.size();j++)
            {
                if(player.get(i)>=ranked.get(j))
                {
                    flag=1;
                    ranked.add(j,player.get(i));
                    break;
                }
            }
            if(flag==0)
            ranked.add(player.get(i));
        }
        
        //ranking the elements of List "ranked"
        int count=1;
        int cache=ranked.get(0);
        for(int i=0;i<ranked.size();i++)
        {
            if(ranked.get(i)==cache)
            {
                fin.add(count);
            }
            else
            {
                count++;
                fin.add(count);
                cache=ranked.get(i);
            }
        }
        //storing the ranks of the player
        List<Integer> fin2=new ArrayList<Integer>();
        for(int i=0;i<player.size();i++)
        {
            for(int j=0;j<ranked.size();j++)
            {
                if(ranked.get(j)==player.get(i))
                {
                    fin2.add(fin.get(j));
                    break;
                }
            }
        }
        return fin2;
    }

    public static void main(/*String[] args*/)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> ranked=new ArrayList<Integer>();
        List<Integer> player=new ArrayList<Integer>();

        System.out.println("Enter the freq. of ranked list.");
        int n=sc.nextInt();
        System.out.println("Enter the ranked List.");
        for(int i=1;i<=n;i++)
        {
            int temp=sc.nextInt();
            ranked.add(temp);
        }

        System.out.println("Enter the freq. of player scores.");
        int r=sc.nextInt();
        System.out.println("Enter the scores of the player.");
        for(int j=1;j<=r;j++)
        {
            int temp=sc.nextInt();
            player.add(temp);
        }
        //System.out.println(ranked);
        //System.out.println(player);
        List<Integer> result=new ArrayList<Integer>();
        result=ranking(ranked,player);
        System.out.println("\n"+"The respective ranks of the player is: "+result);
        
    }
}
