import java.util.Scanner;

public class cwh_37_try_catch {
    public static void main(String[] args) {
        // ? Exceptions are the problem arise that casuses disruption of normal flow of
        // ? program.There are 2 kind of exceptions
        /*
         * Checked Exceptions- These are exception which identified at compile time and
         * is handeled by compiler
         * EX- When a sleep is called Thread.sleep(500) then it shows error as interrupt
         * can happen to that thread and
         * InterruptException will be thrown.
         * 
         * Unchecked Exceptions- Thse are exception which compiler not is interested to
         * recognise the code may or may not
         * produce error but is only detected at running enviroment.
         * Ex- ArrayIndexOutOfBound, Arithmetic exceptions
         */

        /**
         * ! The try{} and catch(){} block help to handel any run-time exceptions to
         * ! prevent program from abnormal termination
         * ! Try contains code/statements that may produce error and the JVM try this
         * !code to run
         * ! Catch is used to catch the error caused in code.
         * ! Java also allows us to handel specialised exceptions
         */

        int a = 6;
        int b = 0;
        // without handelling
        // int c = a / b;
        // System.out.println("Division: " + c);

        try {
            int c = a / b;
            System.out.println("Division: " + c);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("We failed to Divide");
            System.out.println("ERROR... " + e);
        }

        // We can handel each of specified Exception by typing multiple catch block that
        // corresponds to single try
        int[] marks = new int[] { 28, 90, 55, 28, 30 };

        System.out.print("Enter index: ");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        System.out.print("Division Factor: ");
        int factor = sc.nextInt();
        System.out.println();
        sc.close();

        try {
            System.out.println("Value marks[" + ind + "]= " + marks[ind]);
            float res = marks[ind] / factor;
            System.out.println("After division " + res);
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Incorrect index");
            System.out.println(arr);
        } catch (ArithmeticException cal) {
            System.out.println(cal);
        } catch (Exception e) {
            // universal block for any other exceptions
            System.out.println(e);
        }

    }
}
