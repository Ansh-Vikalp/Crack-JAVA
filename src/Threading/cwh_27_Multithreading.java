package Threading;
//Creating a Thread🧵 By Implementing Runnable Interface

class MyThreadRunnable implements Runnable {

    @Override
    public void run() {

        int k = 50;
        while (k != 0) {
            System.out.println("MyThreadRunnable THREAD " + k);
            k--;
        }
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {

        int k = 50;
        while (k != 0) {
            System.out.println("MyThreadRunnable2 THREAD " + k);
            k--;
        }
    }
}

public class cwh_27_Multithreading {
    public static void main(String[] args) {
        // we can't directely call start() of Runnable interface
        // For every Bullet we need it's Gun.🔫
        /*
         * MyThreadRunnable t1= new MyThreadRunnable();
         * MyThreadRunnable2 t2= new MyThreadRunnable2();
         * t1.start();//❌The method start() is undefined for the type MyThreadRunnable
         * t2.start();
         */

        // Here our gun is Thread class and bullet is MyThreadRunnable
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }

}
