package Threading;

public class priority {

    public static void main(String[] args) {



        Thread t0 = new Th1();
        t0.setPriority(1);
        Thread t1 = new Th1();
        t0.setPriority(2);
        Thread t2 = new Th1();
        t0.setPriority(3);
        Thread t3 = new Th1();
        t0.setPriority(4);
        Thread t4 = new Th1();
        t0.setPriority(5);
        Thread t5 = new Th1();
        t0.setPriority(6);
        Thread t6 = new Th1();
        t0.setPriority(7);
        Thread t7 = new Th1();
        t0.setPriority(8);
        Thread t8 = new Th1();
        t0.setPriority(9);
        Thread t9 = new Th1();
        t0.setPriority(10);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}

class Th1 extends Thread{
    @Override
    public void run() {
        int no=1000;
        String name = Thread.currentThread().getName();
        for (int i = 0; i < no ; i++) {
            System.out.println(i+" "+name);
        }
    }
}
