package Threading;

class ThreadPriorities extends Thread {

    public ThreadPriorities() {
    }

    public ThreadPriorities(String s) {
        super(s);
    }

    // !Note- It is not necessary to create two classes for two thread we can have a
    // !single class and can create multiple obj of it.
    public void run() {
        int u = 100;
        while (u > 0) {
            System.out.println("Inside the run() " + Thread.currentThread().getName());
            /* //?we can also use this.getname() as current object */
            u--;
        }
    }
}

public class cwh_30_Multithreading {
    public static void main(String[] args) {

        // Creating multiple diffrent threads of class threadPriorites
        ThreadPriorities t1 = new ThreadPriorities("Thread-0");
        ThreadPriorities t2 = new ThreadPriorities("Thread-1");
        ThreadPriorities t3 = new ThreadPriorities("Thread-2");
        ThreadPriorities t4 = new ThreadPriorities("Thread-3");
        ThreadPriorities t5 = new ThreadPriorities("Thread-4(highest)");
        // ThreadPriorities t6 = new ThreadPriorities();

        // *By Default the piorites of all threads are Thread.NORM_PRIORITY=5
        System.out.println("Thread1(" + t1.getName() + ") has PROIRITY: " + t1.getPriority());
        System.out.println("Thread2(" + t2.getName() + ") has PROIRITY: " + t2.getPriority());
        System.out.println("Thread3(" + t3.getName() + ") has PROIRITY: " + t3.getPriority());
        System.out.println("Thread4(" + t4.getName() + ") has PROIRITY: " + t4.getPriority());
        System.out.println("Thread5(" + t5.getName() + ") has PROIRITY: " + t5.getPriority());
        // System.out.println("Thread6(" + t6.getName() + ") has PROIRITY: " +
        // t6.getPriority());

        // *Setting explicitly ThreadPriority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(2);
        t3.setPriority(3);// TODO: Here t4 has default of 5 PRiority
        t5.setPriority(Thread.MAX_PRIORITY);

        // *New Priorities of each threads
        System.out.println("Thread1(" + t1.getName() + ") has PROIRITY: " + t1.getPriority());
        System.out.println("Thread2(" + t2.getName() + ") has PROIRITY: " + t2.getPriority());
        System.out.println("Thread3(" + t3.getName() + ") has PROIRITY: " + t3.getPriority());
        System.out.println("Thread4(" + t4.getName() + ") has PROIRITY: " + t4.getPriority());
        System.out.println("Thread5(" + t5.getName() + ") has PROIRITY: " + t5.getPriority());

        // ?As no new thread has started so JVM runs only Main Thread automatically
        // which even not need to be invoked
        // ?We can verify it by following-
        System.out.println("Current Thread in execution: " + Thread.currentThread().getName());
        System.out.println("PRIORITY: " + Thread.currentThread().getPriority());

        // !Changing Priority of Main to 7
        Thread.currentThread().setPriority(7);
        System.out.println("Current Thread in execution: " + Thread.currentThread().getName());
        System.out.println("PRIORITY: " + Thread.currentThread().getPriority());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
