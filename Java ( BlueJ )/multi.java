public class multi
{
    public static void main(String args[])
    {
        System.out.println("App started..");
        
        printer pt=new printer();
        myThread mt=new myThread(pt);
        yourThread yt=new yourThread(pt);
        mt.start();
        yt.start();
        //pt.printDoc(10,"deep.pdf");
        
        System.out.println("App finished..");
    }
}

class printer
{
    void printDoc(int num, String s)
    {
        for(int i=1;i<=num;i++)
        {
            try{
                Thread.sleep(500);
                System.out.println(">> Printing doc: "+s+": "+i);
            }
            catch(InterruptedException e)
            {
                System.out.println("Eception caught!\n");
            }
        }
    }
}

class myThread extends Thread
{
    printer pt2;
    myThread(printer p)
    {
        pt2=p;
    }

    public void run()
    {
        pt2.printDoc(20,"sylvie.pdf");
    }
}

class yourThread extends Thread
{
    printer pt2;
    yourThread(printer p)
    {
        pt2=p;
    }

    public void run()
    {
        pt2.printDoc(20,"abigail.pdf");
    }
}