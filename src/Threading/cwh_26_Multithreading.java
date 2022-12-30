package Threading;

class MyThread extends Thread {

    public void show() {

        int i = 3;
        while (i != 0) {
            System.out.println("MyThread Serializability");
            i--;
        }
        System.out.println();
    }

    @Override
    public void run() {
        int j = 100;
        while (j-- > 0) {
            System.out.println("Cooking from MyThread");
            System.out.println("I am happy");
        }

    }

}

class MyThread2 extends Thread {

    public void show() {

        int i = 3;
        while (i != 0) {
            System.out.println("MyThread2 Serializability");
            i--;
        }
        System.out.println();
        System.out.println();

    }

    @Override
    public void run() {
        int j = 100;
        while (j-- > 0) {
            System.out.println("Whatsapp Chatting from MyThread2");
            System.out.println("I am sad");
        }

    }

}

public class cwh_26_Multithreading {
    public static void main(String[] args) {

        System.out.println("--------------------WITHOUT MULTITHREADING------------------");
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.show();
        t2.show();
        System.out.println();
        System.out.println();
        System.out.println("----------------------WITH MULTITHREADING--------------------");
        t1.start();
        t2.start();

    }

}
