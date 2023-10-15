//arraylist in arrayList problem

import java.io.*;
import java.util.*;

public class listInlist 
{

    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++)
        {
            
            int d=sc.nextInt();
            ArrayList<Integer> arr1=new ArrayList<Integer>();
            for(int j=0;j<d;j++)
            {
                arr1.add(sc.nextInt());

            }

            arr.add(arr1);
        }
        
        
        int q=sc.nextInt();
        if(q<1 || q>n)
        System.exit(0);

        ArrayList<ArrayList<Integer>> arr2=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<q;i++)
        {
            
            ArrayList<Integer> arr3=new ArrayList<Integer>();
            arr3.add(sc.nextInt());
            arr3.add(sc.nextInt());
            arr2.add(arr3);
        }
        
        /*for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.get(i).size();j++)
         
            {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("\n"+"\n");
        for(int i=0;i<arr2.size();i++)
        {
            for(int j=0;j<arr.get(i).size();j++)
         
            {
                System.out.print(arr2.get(i).get(j)+" ");
            }
            System.out.println();
        }*/
        
        for(int i=0;i<q;i++)
        {
            int temp1=arr2.get(i).get(0);
            int temp2=arr2.get(i).get(1);
            
            for(int j=0;j<arr.size();j++)
            {
                try
                {
                    System.out.println(arr.get(temp1-1).get(temp2-1));
                    break;
                }
                catch(Exception e)
                {
                   System.out.println("ERROR!");
                   break;
                }
            }
        }
                
    }
}


