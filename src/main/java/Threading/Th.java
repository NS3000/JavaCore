package Threading;

public class Th {
    public static void main(String[] args) throws InterruptedException {

        count tr = new count(50);
        count tr1 = new count(5000000);
        //start vs run testing

        tr.start();
        tr1.start();

        tr.join();

        System.out.println("Main ended");

    }
}
class count extends Thread{
    int number;
    count(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("running "+ Thread.currentThread().getName());
        for (int i = 0; i < number; i++) {
            System.out.println(i+" - "+ Thread.currentThread().getName());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
