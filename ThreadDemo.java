public class ThreadDemo extends  Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(i+" ");
        }
    }
        public static void main(String[]args){
            ThreadDemo t1=new  ThreadDemo();
            ThreadDemo t2=new  ThreadDemo();
            ThreadDemo t3= new ThreadDemo();
            t1.start();
            t2.start();
            t3.start();

        }
    }
