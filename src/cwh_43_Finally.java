
public class cwh_43_Finally {

    public static int division() {
        int c = 99;
        try {
            int a = 6;
            int b = 0;
            c = a / b;
        } catch (Exception e) {
            System.out.println(e);
            return c;
            // System.out.println("This will never execute");
        } finally {
            System.out.println("Clean up... End of function");
        }

        return -1;
    }

    public static void main(String[] args) {
        /*
         * Finally block contains code which necessary need to be executed no matter
         * whether exception has handeled or not
         * This block will even runs if we bypassed some return, break , continue
         * statements It allows programmer to clean-up code(close file, System
         * resources, close connection, garbage collector) even if exception
         * occured.Finally is always used with a try block, and each try block can be
         * associated to only one finally.
         * Finally block will ont execute only when Jvm has stopped(System.exit()) or
         * some serious
         * abnormal error has found.
         */

        // ! 🦸‍♂️CASE-1 When exception has not happened

        try {
            int x = 33;
            int y = 3;
            int z = x / y;
            System.out.println("z= " + z);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        } finally {
            System.out.println("End of Main program 1- wih finally{}");
        }
        System.out.println();
        System.out.println();
        // ! 🦸‍♂️CASE-2 When Exception happend and is handeled
        // ! 🦚 Way-1
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("c= " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("End of Main program 2");
        }
        // ! 🦚 Way-2
        System.out.println();
        System.out.println();
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("c= " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // ? This will also works fine as exception been handeled and normal flow of
        // ? program done.
        System.out.println("End of Main program2- Without finally{}");

        // ! 🦸‍♂️ CASE-3 When Exception has happened but, not handeled!
        // String a = null;
        // try {
        // // throws a nullPointerException
        // System.out.println(a.equals("Ansh"));
        // } catch (ArithmeticException ap) {
        // System.out.println(ap);
        // } finally {
        // System.out.println("End of Main program3- with finally{}");
        // }

        System.out.println();
        System.out.println();

        // try {
        // // throws a nullPointerException
        // System.out.println(a.equals("Ansh"));
        // } catch (ArithmeticException ap) {
        // System.out.println(ap);
        // }
        // //! Below line not execute at all
        // System.out.println("End of Main program3- without finally{}");
        System.out.println();
        System.out.println();

        // ! 🦸‍♂️CASE-4 To Perform Cleanup- accidently bypass return, break, continue

        System.out.println("Division= " + cwh_43_Finally.division());
        System.out.println();
        int r = 8;
        int bzz = 6;
        for (int i = 0; i < 11; i++) {

            try {
                int c = r / bzz;
                System.out.println("i= " + i + "\tc=" + c + "\tbzz=" + bzz);
            } catch (Exception e) {
                System.out.println("<<" + e.getMessage() + ">>");
                break;
            } finally {
                System.out.println("executed even when break occurs");
            }
            bzz--;

        }
        System.out.println();
        System.out.println();
        // ! 🦸‍♂️CASE-5 Finally does not execute if JvM shutdown while pgm executes
        // try-catch(){}
        try {
            System.out.println("Inside try{}");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Inside catch(){}");
        } finally {
            System.out.println("Inside finally{}");
        }

    }
}
