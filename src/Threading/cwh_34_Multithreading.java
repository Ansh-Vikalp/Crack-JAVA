package Threading;

//Interrupting a thread that do not stops working
class B extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {

                System.out.println(Thread.currentThread().getName() + "(child Thread)  " + i);
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " still Running...");

    }
}

public class cwh_34_Multithreading {
    public static void main(String[] args) {
        // Interrupting a thread that do not stops working(refer to class B)

        // In the above code, the for loop runs for the first time, but the child thread
        // is put to sleep after that. So, the main() method interrupts the child
        // thread, and InterruptedException is generated. Here, the child thread comes
        // out of the sleeping state, but it does not stop working.

        B t3 = new B();
        B t4 = new B();
        t3.start();
        t3.interrupt();
        t4.start();
    }

}
