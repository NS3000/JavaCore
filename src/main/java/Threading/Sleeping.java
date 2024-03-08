package Threading;

public class Sleeping extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sleeping t = new Sleeping();
        Sleeping t1 = new Sleeping();
        t.start();
        t1.start();

    }
}
