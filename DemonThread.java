

public class DemonThread extends Thread {
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("The thread is daemon thread");

        }
        else
            System.out.println("The thread is user thread");
    }
    //
    public  void finalize()
    {
        System.out.println("objects are collected for garbage collection");
    }

    public static void main(String[] args) {

        DemonThread t1=new DemonThread();
        DemonThread t2=new DemonThread();
        //	t1.setDaemon(true);
        //	t2.setDaemon(false);
        //	t1.start();
        //	t2.start();
        t1=null;
        t2=null;
        System.gc();
    }

}