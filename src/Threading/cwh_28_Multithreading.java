package Threading;

class MyThreadNam extends Thread {

    public MyThreadNam(String s) {
        super(s);
    }

    @Override
    public void run() {
        int y = 50;
        while (y-- > 0) {
            System.out.println("MyThreadNam " + y);
        }
        System.out.println("Thread 1 is Terminated");
    }
}

class MyThreadNam2 extends Thread {

    public MyThreadNam2(String s) {
        super(s);
    }

    @Override
    public void run() {
        int y = 8;
        while (y-- > 0) {
            System.out.println("MyThreadNam2 " + y);
        }
        System.out.println("Thread 2 is Terminated");
    }
}

public class cwh_28_Multithreading {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");
        System.out.println();
        // * Thread1
        MyThreadNam t1 = new MyThreadNam("Ansh");// TODO: Use of Thread(String name) Constructor
        System.out.println("Thread name is: " + t1.getName());
        System.out.println("Thread id is: " + t1.getId());
        t1.start();
        // * Thread2
        MyThreadNam2 t2 = new MyThreadNam2("Vikalp");// TODO: Use of Thread(String name) Constructor
        System.out.println("Thread name is: " + t2.getName());
        System.out.println("Thread id is: " + t2.getId());
        t2.start();

    }
}
