//program to generate a hadamard matrix
//using Sylvester's Construction
import java.util.*;

public class hdmrd
{
    boolean arr[][];
    int n;
    
    public hdmrd()
    {
        n=0;
    }
    public static Scanner sc=new Scanner(System.in);
    
    void entry()
    {
        System.out.print("enter the order of matrix (any value of 2ˣ form): ");
        n=sc.nextInt();
        System.out.println("\n");
        arr=new boolean[n][n];
    }
    
    void generate()
    {
        arr[0][0] =true;
        for (int k=1;k<n;k+=k) {
            for (int i=0;i<k;i++) {
                for (int j=0;j<k;j++) {
                    arr[i+k][j]   =  arr[i][j];
                    arr[i][j+k]   =  arr[i][j];
                    arr[i+k][j+k] = !arr[i][j];
                }
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]) 
                System.out.print("* ");
                
                else               
                System.out.print(". ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String args[])
    {
        hdmrd ob=new hdmrd();
        ob.entry();
        ob.generate();
    }
}