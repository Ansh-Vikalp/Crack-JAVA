package Threading;

class DemoRunnable implements Runnable {

    @Override
    public void run() {
        int b = 50;
        while (b-- > 0) {
            System.out.println("DemoRunnable " + b);
            System.out.println("Hacker");
        }
    }
}

class DemoRunnable2 implements Runnable {

    @Override
    public void run() {
        int b = 50;
        while (b-- > 0) {
            System.out.println("DemoRunnable2 " + b);
            System.out.println("Cooker");
        }
    }
}

public class cwh_29_Multithreading {
    public static void main(String[] args) {

        DemoRunnable target1 = new DemoRunnable();
        // TODO: Use of Thread(Runnable target, String name)
        Thread t1 = new Thread(target1, "Shiva");
        DemoRunnable2 target2 = new DemoRunnable2();
        // TODO: Use of Thread(Runnable target, String name)
        Thread t2 = new Thread(target2, "Krishna");

        System.out.println("DemoRunnable Thread name: " + t1.getName());
        System.out.println("DemoRunnable Thread ID: " + t1.getId());
        t1.start();
        System.out.println("DemoRunnable2 Thread name: " + t2.getName());
        System.out.println("DemoRunnable2 Thread ID: " + t2.getId());
        t2.start();

    }

}
