package Threading;

// Creating a Thread🧵 by extending Thread class
class MyThread extends Thread {

    public void show() {

        int i = 3;
        while (i != 0) {
            System.out.println("MyThread Serializability " + i);
            i--;
        }
        System.out.println();
    }

    @Override
    public void run() {
        int j = 100;
        while (j-- > 0) {
            System.out.println("Cooking from MyThread " + j);
            System.out.println("I am happy " + j);
        }

    }

}

class MyThread2 extends Thread {

    public void show() {

        int i = 3;
        while (i != 0) {
            System.out.println("MyThread2 Serializability " + i);
            i--;
        }
        System.out.println();
        System.out.println();

    }

    @Override
    public void run() {
        int j = 100;
        while (j-- > 0) {
            System.out.println("Whatsapp Chatting from MyThread2 " + j);
            System.out.println("I am sad " + j);
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
