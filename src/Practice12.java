
class HappyThread extends Thread {
    public void run() {
        int y = 50;
        while (y-- > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            System.out.println(this.getName() + " Good Morning");

        }
    }
}

class SadThread extends Thread {

    public SadThread() {
    }

    public SadThread(String g) {
        super(g);
    }

    public void run() {
        int y = 50;
        while (y-- > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            System.out.println(this.getName() + " Welcome ");
        }

        System.out.println();
    }
}

public class Practice12 {
    public static void main(String[] args) {

        // ?Question 1: Write a program to print "Good morning" and "Welcome"
        // ?continuously on the screen in Java using threads.

        // ?Question 2: Add a sleep method in the welcome thread of question 1 to delay
        // ?its execution for 200ms.

        HappyThread t1 = new HappyThread();
        SadThread t2 = new SadThread();

        t1.start();
        t2.start();

        // ?Question 3: Demonstrate gerPriority() and setPriority() methods in Java
        // ?threads.

        HappyThread t3 = new HappyThread();
        SadThread t4 = new SadThread("Thread-3 (Important)");

        // Before setting priority
        System.out.println("Priority of <" + t1.getName() + "> " + t1.getPriority());
        System.out.println("Priority of <" + t2.getName() + "> " + t2.getPriority());
        System.out.println("Priority of <" + t3.getName() + "> " + t3.getPriority());
        System.out.println("Priority of <" + t4.getName() + "> " + t4.getPriority());

        // After setting Priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        System.out.print("\n");
        System.out.println("Priority of <" + t1.getName() + "> " + t1.getPriority());
        System.out.println("Priority of <" + t2.getName() + "> " + t2.getPriority());
        System.out.println("Priority of <" + t3.getName() + "> " + t3.getPriority());
        System.out.println("Priority of <" + t4.getName() + "> " + t4.getPriority());

        // ?Question 4: How do you get the state of a given thread in Java?
        System.out.println(t3.getName() + " " + t3.getState());// will be in new state

        t3.start();
        t4.start();// This thread will be given more Priority over the others

        // ?Question 5: How do you get the reference to the current thread in Java?
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
    }
}
