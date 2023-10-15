public class gcd {
    public static int getGCD(int x,int y)
    {
        int ans=1;
        for(int i=1;i<=x&&i<=y;i++)
        {
            if(x%i==0 && y%i==0)
            ans=i;
        }
        return ans;
    }
    
}