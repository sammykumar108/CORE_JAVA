package threadClassMethods;

// interrupted()-> It is used to check the thread interrupt status but if the interrupt status is true it will change the 
// interrupt status into false.


class MyThread14 extends Thread
{
    public void run()
    {
        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("hi : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (3) : "+Thread.interrupted());
    }
}
public class Test14
{
    public static void main(String[] args)
    {
    	MyThread14 mt=new MyThread14();
        mt.start();
        
        mt.interrupt();
    }
}