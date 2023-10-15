import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hr 
{
    
    private static final Scanner sc= new Scanner(System.in);
    public static void main() {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        sc.close();
        int max=-99999;
        
        for(int i=0;i<4;i++)
        {
           for(int j=0;j<4;j++)
           {
              int up=arr[i][j]+arr[i][j+1]+arr[i][j+2];
              int mid=arr[i+1][j+1];
              int down=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
              
              if((up+mid+down)>=max)
                 {
                     max=up+mid+down;
                 }
           }
        }
        System.out.print(max);
    }
}
