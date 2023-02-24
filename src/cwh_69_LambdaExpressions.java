
@FunctionalInterface
interface Person {
    void eat();
}

@FunctionalInterface
interface Bird {
    // parameterized abstract meathod
    void fly(int wings);
}

// class Ansh implements Person {
// @Override
// public void eat() {
// System.out.println("good fruits...");
// }
// }

/**
 * <I>This class tell a use about Lambda Expressions in Java</I>
 * 
 * @author Ansh Vikalp
 * @since 2023
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html">
 *      See Oracle
 *      docs</a>
 * 
 */

public class cwh_69_LambdaExpressions {
    public static void main(String[] args) {

        // ? Lambda expression work in the same way as Anonymous class does.
        // ? It is used to make our code short
        /*
         * One issue with anonymous classes is that if the implementation of your
         * anonymous class is very simple, such as an interface that contains only one
         * method, then the syntax of anonymous classes may seem unwieldy and unclear
         */
        // ? It removes both code for class implementing an interface and creation of
        // ? object of that class to call a meathod.
        // ? Lambda Expression is only valid for an interface that cointains a single
        // ? abstract meathod only i.e. Fuctional Interface.
        /*
         * Lambda Expressions try to pass functionality as an argument to another
         * method, such as what action should be taken when someone clicks a button?
         */

        // ? Classical
        /*
         * Ansh ansh = new Ansh();
         * ansh.eat();
         * 
         * System.out.println();
         * System.out.println();
         */

        // ? New Generation(LAMBDA Expressions )

        Person p = () -> {
            System.out.println("bad fruits...");
        };

        p.eat();

        // we are also allowed to pass a para to a interface method
        Bird b = (x) -> {
            System.out.println("This bird has Wings= " + x);
        };

        b.fly(2);

    }
}
