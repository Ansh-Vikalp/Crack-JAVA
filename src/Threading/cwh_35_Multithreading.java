package Threading;

//Interrupting a thread that works normally

class C extends Thread {
    public void run() {

        for (int i = 0; i < 6; i++) {

            System.out.println(Thread.currentThread().getName() + "(child Thread)  " + i);
            // Thread.sleep(1000);

        }

    }
}

public class cwh_35_Multithreading {
    public static void main(String[] args) {
        // Interrupting a thread that works normally(refer to class C)

        // On interrupting a thread that is normal (neither in sleep(), wait() state)
        // then there will interrupt()
        // has no effect on it only the interrupt flag is set as true.

        C t5 = new C();
        C t6 = new C();
        t5.start();
        t5.interrupt();
        t6.start();

        System.out.println("Main Thread");

    }
}
