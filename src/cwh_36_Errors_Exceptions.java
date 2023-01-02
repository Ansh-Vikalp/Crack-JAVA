import java.util.Scanner;

public class cwh_36_Errors_Exceptions {
    public static void main(String[] args) {
        // ! 🙉Errors and Exceptions in Java

        /**
         * In the life of a regular programmer or Developer errors are constant
         * companion and is unavoidable
         * with passage of time, practice, patience, consistency we can increase our
         * level of understanding
         * on finding and fixing these errors.
         * ?ERROR handeling is a preventive measure to handel an unexpected situation of
         * execution
         * These tyes of error can be brodely classified as-
         * ! 1)Syntax Error (Compile-Time Error)
         * ! 2)Logical Error (Semantic Error)
         * ! 3)Run-Time Error (Exceptions)
         */

        // ! Syntax Errors
        /*
         * As, the name suggest the error in syntax or grammer of program is known as
         * syntax error.These types of error are obvious and occur when a programmer
         * skip some
         * part of code as originally defined in document.These error are identified by
         * compiler thus, easy to
         * rectify mistake as compiler itself suggest some guees of possible solution.
         * Ex- Missing bracket
         * Improper Nesting
         * semicolon expected
         * use of undeclared variable
         * reference to a class which never created
         * missing main() while execution
         */
        // Uncomment to see errors
        // int a=9
        // int b=5;
        // c=3;
        // System.out.println(a+c);
        // int 7asd= 9;//variable name should be alphanumeric

        // if(b>3
        // {
        // System.out.println(Happy);}

        // ! Logical Errors(Semantic Error/ Bugs🐞)
        /*
         * These errors are purely based on thougth of a programmer.In this error our
         * code produces some wrong output
         * or even does not produce any result which was expected to be some diffrent
         * from programmer end. These come due to wrong logic or thought of program
         * design.
         * These error neighter identified by compiler or even JVM as pgm successfully
         * compiles and run.
         * But the system has no idea what was your pgm supposed to do in normal as
         * programmer mind🤔
         * 
         * EX- We designed a pgm to send msg to our 🥰 but accidently it send to our
         * parent due to bugs in code
         * A bugs/ loopholes reported in website can also invite hackers.
         * The total cost need addition but use of Arithmetic - can cause it a -ve
         * result
         * Incorrect Redirects
         */

        // ?W.A.P to print all prime no
        // ? Prime no are 2,3,5,7,11,13,17,19,23,29,31...
        // ? A prgmer draws that conclusion prime no are of form- 2*n+1 where n>0 and
        // ? including 2. So he writes below code-

        System.out.println(2);
        for (int i = 1; i < 10; i++) {
            System.out.println(2 * i + 1);
        }
        // * But from output we clearly say that 9, 15 are not primes so this is a bug
        // * of pgm/ logical error

        // ? WAP to find sum of natural no from 1 to 10.
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum - i;// ! should use Arithmetic +
        }
        System.out.println("Sumof No's are: " + sum);

        // ! Run-Time Error(Exceptions)
        /*
         * These error are detected during execution of pgm only.We can not judge these
         * error before its actual exection. Sometimes these are discovered when the
         * user enters an invalid data or data which is not relevant. Runtime errors
         * occur when a program does not contain any syntax errors but asks the computer
         * to do something that the computer is unable to reliably do.It is the JVM that
         * can only detect this error
         * 
         * To manage damage caused by such error we need to surround our code in try
         * block and catch it's exception in catch block.thse can only addressed by the
         * end- user of applicatin/ website
         * 
         * Ex- server crash reported to client when they try to fetch data from busy
         * API's
         * Incorrect input given by a user for which pgm not move furthur
         * Crash in Android app when an event has made.
         * Division of no by 0.
         */

        // ? Let us create some run-time errors.
        System.out.println();
        System.out.println();

        System.out.print("User AGE: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();// TODO: Here try to input some String
        // ! Exception in thread "main" java.util.InputMismatchException
        System.out.println("Ansh age is " + age);
        System.out.println();
        System.out.println();

        System.out.print("Dividend: ");
        int n = sc.nextInt();
        System.out.print("Divisor: ");
        int d = sc.nextInt();// TODO: Try with divisor 0
        // ! Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("Qutionet: " + (n / d) + " Remainder: " + (n % d));
        sc.close();

        System.out.println();
        System.out.println();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        for (int i = 0; i < 6; i++) {
            // ! Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index
            // !5 out of bounds for length 5
            System.out.println(i + " element " + arr[i]);
        }
    }
}
