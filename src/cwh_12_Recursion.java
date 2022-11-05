import java.util.Scanner;

public class cwh_12_Recursion {

    static int factorial(int n) {
        // Recursive approach
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial2(int n) {
        // Iterative approch
        int result = 1;
        // Not required even we can include
        // if (n <= 1) {
        // return 1;
        // }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int fibonacci(int n) {
        // here n:= nth term of fibonacci series, starting from 1st term= 0
        // (in some books the series assumed to start from 0th term= 0)
        // fibonacci:= 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Recursion in JAVA
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int num = sc.nextInt();
        System.out.println("Factorial(Recursive) of " + num + " is: " + factorial(num));
        System.out.println("Factorial(Iterative) of " + num + " is: " + factorial2(num));
        System.out.println();
        System.out.println();
        System.out.print("Enter the term no: ");
        int t = sc.nextInt();
        System.out.println("The " + t + " term in fibonacci series is: " + fibonacci(t));
        sc.close();

    }
}
