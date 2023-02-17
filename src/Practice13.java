import java.util.Scanner;

class MaxTriesException extends Exception {
    public MaxTriesException(String message) {
        super(message);
    }
}

public class Practice13 {

    public static void parser(int y) throws IllegalArgumentException {
        if (y < 5) {
            throw new IllegalArgumentException("Value is too low!");

        }
    }

    public void retry() throws MaxTriesException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inside Meathod");
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int i = 5;
        while (i-- > 0) {
            try {

                System.out.print("index= ");
                int index = sc.nextInt();
                if (i == 0)
                    throw new MaxTriesException("MAX_Limit_Reached");
                System.out.println("Value= " + arr[index]);

                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR Incorrect index");
            }

        }
        // sc.close();
    }

    public static void main(String[] args) {
        // 1) Write a java program to demonstrate syntax, logical 2 runtime errors.
        // Syntax Error
        int a = 9;
        int b = 5;
        // c = a + b;
        // System.println();

        // Logical Error

        if (a > b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is greater than " + b);
        }

        // RunTime Error
        // System.out.println(a / (b - 5));

        System.out.print("Enter a num:");
        Scanner sc = new Scanner(System.in);

        try {

            int ss = sc.nextInt();
            parser(ss);
            System.out.println(ss / 0);
        } catch (IllegalArgumentException ill) {
            System.out.println("HeHe\t" + ill);
        } catch (ArithmeticException ar) {
            System.out.println("HaHa\t" + ar);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Write a program that allows you to keep accessing the array until a valid
        // index is given. If max retries exceed 5 print
        // "errors".

        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int i = 5;
        while (i-- > 0) {
            try {

                System.out.print("index= ");
                int index = sc.nextInt();
                {
                    // 4) Modify program in Q3 to throw a custom Exception if max retries are
                    // reached.
                    if (i == 0)
                        throw new MaxTriesException("MAX_Limit_Reached");

                }
                System.out.println("Value= " + arr[index]);

                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR Incorrect index");
            }

            catch (MaxTriesException y) {
                System.out.println(y);
            }
        }
        // sc.close();

        System.out.println();
        System.out.println();
        // 5) Wrap the program in Q3 inside a method which throws your custom Exception.
        try {
            Practice13 ob = new Practice13();
            ob.retry();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
