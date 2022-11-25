import java.util.Scanner;

public class Practice6 {
    static void multable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }

    }

    static void pattern1() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int sumrec(int l) {
        int sum = 0;
        if (l == 0) {
            return 0;
        } else {
            sum += l + sumrec(l - 1);
            return sum;
        }
    }

    public static int fib(int u) {

        if ((u - 1) == 0) {
            return 0;
        } else if ((u - 1) == 1) {
            return 1;
        } else {
            return fib(u - 1) + fib(u - 2);
        }
    }

    public float avg(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (sum) / (float) arr.length;
    }

    public static void pattern1_rec(int n) {
        if (n > 0) {// first print then call
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            pattern1_rec(n - 1);
        }
    }

    public static void pattern2_rec(int n) {
        if (n > 0) {// first call then print
            pattern2_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
         * Q1) Write a Java method to print the multiplication table of a number n.
         * Write a program using functions to print the following pattern:
         * *
         * **
         * ***
         * ****
         * 
         * 
         * 
         * 
         * Q2) Write a recursive function to calculate the sum of first n natural
         * numbers.
         * Write a function to print the following pattern:
         * ****
         * ***
         * **
         * *
         * 
         * 
         * 
         * 
         * Q3) Write a function to print the nth term of the Fibonacci series using
         * recursion.
         * Q4) Write a function to find the average of a set of numbers passed as
         * arguments.
         * Q5) Repeat problem 4 using Recursion.
         * Q6) Repeat problem 2 using Recursion.
         * Q7) Write a function to convert Celsius temperature into Fahrenheit.
         * Q8) Repeat problem 3 using an iterative approach.
         */
        System.out.print("Enter a no= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multable(n);

        System.out.println();
        System.out.println();

        pattern1();

        System.out.println();
        System.out.println();

        System.out.print("Enter n: ");
        int y = sc.nextInt();
        Practice6 ob = new Practice6();
        System.out.println(ob.sumrec(y));

        System.out.println();
        System.out.println();

        pattern2();

        System.out.println();
        System.out.println();

        System.out.print("Enter index of fibonacii: ");
        int u = sc.nextInt();
        System.out.println("Value at index " + u + " is " + fib(u));

        System.out.println();
        System.out.println();

        System.out.println("The average of 5,4,3,2 is: " + ob.avg(5, 4, 3, 2));

        System.out.println();
        System.out.println();
        System.out.println("Recursive way");
        pattern1_rec(4);
        System.out.println();
        pattern2_rec(4);

        System.out.println(converter(23));

        sc.close();

    }

    private static float converter(int c) {
        float foren = 9 / 5f * c + 32;
        return foren;

    }
}
