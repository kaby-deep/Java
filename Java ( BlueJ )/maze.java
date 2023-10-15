//java program to solve a maze problem using recursive technique
//needs work on displaying the solution of the maze
import java.util.*;
public class maze
{
    int arr[][];
    int n;
    boolean sol;
    char visit[][];
    public maze()
    {
        n=0;
        sol=false;
    }
    public static Scanner sc=new Scanner(System.in);
    void entr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of maze (nxn): ");
        n=sc.nextInt();
        arr=new int [n][n];
        visit=new char[n][n];
        System.out.println("Enter cells the maze (0->blocked 1->empty).");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("enter cell value: ");
                int e=sc.nextInt();
                arr[i][j]=e;
                
                visit[i][j]='0';
            }
        }
        System.out.println("\n");
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    void display1()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(visit[i][j]);
            }
            System.out.println();
        }
    }
    void check()
    {
        if(traverse(arr,0,0))
        System.out.println("***Solution to the maze is possible.***");
        else
        System.out.println("Solution to the maze is not possible. !!");
    }
    
    boolean valid(int sx,int sy)
    {
        if(sx>=0 && sx<n && sy>=0 && sy<n )
        return true;
        else
        return false;
    }
    
    boolean traverse(int arr[][],int x,int y)
    {
        if(x==(n-1) && y==(n-1) && arr[x][y]==1)
        {
            visit[x][y]='*';
            return true;
        }
        
        if(valid(x,y)==false)
        {
            return false;
        }
        
        if(visit[x][y]=='*')
        {
            return false;
        }
        
        if( arr[x][y]==0)
        {
            return false;
        }
        
        visit[x][y]=1;
        
        if(traverse(arr,x+1,y))
        {
            visit[x][y]='*';
            return true;
        }
        
        if(traverse(arr,x,y+1))
        {
            visit[x][y]='*';
            return true;
        }
        
        if(traverse(arr,x-1,y))
        {
            visit[x][y]='*';
            return true;
        }
        
        if(traverse(arr,x,y-1))
        {
            visit[x][y]='*';
            return true;
        }
        
        return false;
    }
    
    public static void main()
    {
        maze ob=new maze();
        ob.entr();
        ob.check();
        System.out.println("Original maze.");
        ob.display();
        System.out.println("\n"+"Solution maze.");
        ob.display1();
    }
}