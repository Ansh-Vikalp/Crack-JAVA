package Threading;

//TODO:Implementation of java.lang.Thread.sleep()
public class cwh_32_Mutithreading extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                /*
                 * When a thread is sleep then the Thread Schedular simple picks another thread
                 * of queue to execute
                 * It is also possible to sleep the main thread by Thread.sleep(millis)
                 * It can result in Interrupted Exception when some other thread try to
                 * interrupt/block it
                 * while it is in state of sleeping() or joining()
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "  " + i);
        }
    }

    public static void main(String[] args) {

        cwh_32_Mutithreading s1 = new cwh_32_Mutithreading();
        cwh_32_Mutithreading s2 = new cwh_32_Mutithreading();
        cwh_32_Mutithreading s3 = new cwh_32_Mutithreading();
        s1.start();
        s2.start();
        s3.start();

    }
}
