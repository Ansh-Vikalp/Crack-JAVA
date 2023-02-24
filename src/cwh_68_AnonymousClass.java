
interface DemoAno {
    abstract public void meth1();

    void meth2();

    static void random() {
        System.out.println("prove that static meth can have body");
    }

}

abstract class DemoAno2 {
    abstract void meth3();
    // + some others concrete meathods
}

class DemoAno3 {
    protected int y;

    public DemoAno3(int o) {
        this.y = o;
    }

    public void getAge() {
        System.out.println("Your age is: " + this.y);
    }
}
/*------------------------------------------------------------------------------------------------------------------------- */
// ? Traditional way to implement an interface
// class AnonymousDemo implements DemoAno {

// public void display() {
// System.out.println("Hello!");
// }

// @Override
// public void meth1() {
// // Traditional way of implementation by craeting class
// System.out.println("meth-1 of classic appraoch ");
// }

// @Override
// public void meth2() {
// // Traditional way of implementation by craeting class
// System.out.println("meth-2 of classic appraoch ");
// }

// }
/*------------------------------------------------------------------------------------------------------------------------- */

/**
 * <I>This class tell a use about Anonymous classes in Java</I>
 * 
 * @author Ansh Vikalp
 * @since 2023
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html">
 *      See Oracle
 *      docs</a>
 * 
 */

public class cwh_68_AnonymousClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // ? Using Dynamic dispacth by classic
        /*
         * DemoAno o = new AnonymousDemo();
         * o.meth1();
         * o.meth2();
         */
        // o.display()❌--> Not in scope of reference o
        // ? Anonymous Class 🦹‍♂️
        // ? Short hand tool (Anonymous class)--> Created by compiler
        // ? These class does not have name and used when we require to create only few
        // ? time object of class implementing interface or extending other
        // ? abstract class/concrete class.
        // ? Make code concise, Relevent
        // ? Anonymous class can be craeted for any interface/ abstract class or even a
        // ? concrete class

        // *OF Interface DemoAno */
        DemoAno obb = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("Meth-1 of Anonymous class.");
            }

            @Override
            public void meth2() {
                System.out.println("Meth-2 of Anonymous class.");
            }

            // Below is the Specialized meth of Anonymous class implemnting DemoAno
            // It can't be accesed as here refernce is type Parent.
            int goriya() {
                return 8;
            }
        };

        obb.meth1();
        obb.meth2();
        // ! obb.goriya()--> ERROR
        // Static methaod of DemoAno
        DemoAno.random();
        System.out.println();
        System.out.println();

        // *OF Abstract class DemoAno2 */

        DemoAno2 op = new DemoAno2() {

            @Override
            void meth3() {
                System.out.println("Meth-3 of abstract Anonymous class");
            }

        };
        op.meth3();

        System.out.println();
        System.out.println();

        // Please note that we can even create a Abstract class for a normal class and
        // can Override it;s meathod for same.
        DemoAno3 o9 = new DemoAno3(4) {
            @Override
            public void getAge() {
                System.out.println("New Age= " + (this.y + 1));
            }

        };

        o9.getAge();
    }
}
