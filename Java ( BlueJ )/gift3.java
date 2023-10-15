//https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class gift3 
{
    private static long cost( long B,long W,long X,long Y,long Z )
    {
        long cost = 0;
        
        if( X < Y ) //if cost of black is less than white, we buy blacks more
        {
            cost = cost + ( B * X );  //cost of predefined blacks
            if( Y <(Z + X ))
            {
                cost = cost + ( W * Y );  //if buying white is economic
            }
            else
            {
                cost = cost + ( W * ( Z + X ) );  //else buy blacks(number eq. to predefined whites) and exchange
            }
        }
        else  //cost of whites is less than black, we buy whites more
        {
            cost = cost + ( W * Y );  //cost of predefined whites
            if( X < Z + Y )
            {
                cost = cost + ( B * X );  //if buying black is economic
            }
            else
            {
                cost = cost + ( B * ( Z + Y ) );  //else buy whites(number eq. to predefined blacks) and excahne
            }   
        }
        return cost;
    }

    public static void main() 
    {
        Scanner scan = new Scanner( System.in );
        int testCases = scan.nextInt();
        
        for( int i = 0;i < testCases;i++ )
        {
            System.out.println( cost( scan.nextLong(),scan.nextLong(),scan.nextLong(),scan.nextLong(),scan.nextLong() ) );
        }
    }
}