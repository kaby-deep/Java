//calculates the minimum jumps required to reach end of array
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class minJump {
    static int num=0;

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] arr,int leap,int count) {
        for(int i=count+leap;i>=count+1;i--)
        {
            if(i>=arr.length)
            {
               if(i>arr.length)
                break;

               if(i==arr.length)
               {
                   num++;
                   break;
               }
            }
            
            if(arr[i]==0)
            {
                num++;
                return jumpingOnClouds(arr,leap,i);

            }
        }
        return num;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main()
    {
        int x=0;
        int start=0;
        int leap=0;
        System.out.print("Enter the length of array: \n");
        int arr[]=new int[x=scanner.nextInt()];
        System.out.println("Enter values (0and1) to the array.\n");
        for(int j=0;j<x;j++)
        {
            arr[j]=scanner.nextInt();
        }
        System.out.println("\n");
        System.out.print("Enter the starting index (0 is recommended): \n");
        start=scanner.nextInt();
        System.out.print("Enter the jump value: \n");
        leap=scanner.nextInt();
        
        
        int result=jumpingOnClouds(arr,leap,start);
        System.out.println("\n Minimum no. of jumps required to win: "+result);
        
    }
}
