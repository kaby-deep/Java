import java.util.*;
public class hanoi
{
    static int count=0;
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    {
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n=sc.nextInt();
        System.out.println("\n");
        towerOfHanoi(n,'A','C','B');
        System.out.println("\nNumber of steps: "+(int)(Math.pow(2,n)-1));
    }
}