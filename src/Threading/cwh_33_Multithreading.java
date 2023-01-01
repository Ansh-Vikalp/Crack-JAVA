package Threading;

//Interrupting a that stops working
class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {

                System.out.println(Thread.currentThread().getName() + "  " + i);
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println(
                    "Note after this Thread-0 never excutes even it's sleep is over while Thread-1 allowed to execute\n");
            throw new RuntimeException("Thread interrupted..." + e);
        }
        System.out.println(Thread.currentThread().getName() + " still Running...");
        System.out.println();
        System.out.println();

    }
}

public class cwh_33_Multithreading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        // Interrupting a that stops working( refer to class A)
        // In this program, after interrupting the thread, we throw a new exception so
        // it will stop working.
        A t1 = new A();
        A t2 = new A();
        t1.start();
        t1.interrupt();
        t2.start();

    }
}
