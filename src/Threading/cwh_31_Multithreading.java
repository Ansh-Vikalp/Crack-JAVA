package Threading;

//Here in this tutorial we will basicall see use of three important Thread meathods-
// *join()
// sleep()
// interrupt()
//TODO:Implementation of java.lang.Thread.join()
class ThreadJoin extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);// sleeps for 1 second after every iteration
            } catch (Exception e) {
                System.out.println("EXCEPTION: " + e);
            }
            System.out.println(Thread.currentThread().getName() + " iteration: " + i);
        }
    }
}

class ThreadJoin2 extends Thread {

    public void run() {
        int u = 0;
        while (u < 200) {
            System.out.println(Thread.currentThread().getName() + " iteration: " + u);
            u++;
        }

    }
}

public class cwh_31_Multithreading {
    public static void main(String[] args) {

        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin2 t2 = new ThreadJoin2();
        ThreadJoin2 t3 = new ThreadJoin2();

        t1.start();
        /*
         * Here t1 can execute only 3 times as for each movement of loop reqires 1 sec
         * and we defined the join for only 4 sec so 4000/1000 =4 but at 4th time other
         * threads can start and at last the last iteration of Thread-0 executes
         */

        try {

            t1.join(4000);// this will allow Thread-1 to only wailt for 4 seconds after t2 & t3 can start
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();

    }

}
