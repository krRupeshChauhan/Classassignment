
    public class ThreadRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Creating thread using runnable interface"+" "+Thread.currentThread().getName());

        }
        public static void main(String[]args)
        {
            ThreadRunnable demo2=new  ThreadRunnable();//1st way to write
            Thread t1=new Thread(demo2);
            t1.start();
            Thread t2=new Thread( new ThreadRunnable());//2nd way to write
t2.start();
        }
}
