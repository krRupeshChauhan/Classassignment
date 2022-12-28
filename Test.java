public class Test extends Thread {
    Test(String name) {
        super(name);

    }

    public void run() {
        System.out.println("thread is running!!" + Thread.currentThread().getName() + " "+
                Thread.currentThread().getPriority());

    }


    public static void main(String[] args) {
        Test t1 = new Test("Test Thread-1");
        t1.start();//runnable state
        Test t2 = new Test("Test Thread-2");
        t2.start();
    }

}