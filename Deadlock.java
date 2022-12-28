
public class Deadlock {

    public static void main(String[] args) {

        String resource1="pen";
        String resource2="paper";
        Thread sonali=new Thread()
        {
            public void run()
            {
                synchronized (resource1) {
                    System.out.println("Sonali lock pen");

                    try {
                        Thread.sleep(200);

                    }
                    catch(Exception e)
                    {

                    }
                    synchronized (resource2) {
                        System.out.println("sonali trying to lock paper");
                    }
                }
            }
        };//anonymous
        Thread pari=new Thread()
        {
            public void run()
            {
                synchronized (resource2) {
                    System.out.println("pari lock paper");

                    try {
                        Thread.sleep(200);

                    }
                    catch(Exception e)
                    {

                    }
                    synchronized (resource1) {
                        System.out.println("pari trying to lock pen");
                    }
                }
            }

        };
        sonali.start();
        pari.start();


    }

}