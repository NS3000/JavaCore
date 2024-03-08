package Threading;

import java.io.IOException;

public class Join extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i+Thread.currentThread().getName());
            }catch(InterruptedException w){}
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ThreadGroup tg = new ThreadGroup("A");
        Thread t1 = new Thread(tg,new Join());
        Thread t2 = new Thread(tg,new Join());
        Thread t3 = new Thread(tg,new Join());

        System.out.println(tg.activeCount());

        t1.start();


        t1.join();

        t2.start();
        t3.start();
        System.out.println(tg.activeCount());

    }
}
