class ca{}
class execCode extends ca implements Runnable
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("doc: "+i+" printer 2");
        }
    }
}
public class threads
{
    public static void main(String args[])
    {
        System.out.println("\n\nThreads Started");
        Runnable r=new execCode();
        Thread task=new Thread(r);
        task.start();
        //job 1
        for(int i=1;i<=10;i++)
        System.out.println("doc: "+i+" printer 1");
        System.out.println("Threads Finished");
        System.out.println("\n\n");
    }
}