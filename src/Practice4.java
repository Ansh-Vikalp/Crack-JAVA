import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        /*
         * Q1 W.A.P to print following pattern
         * * * * *
         * * * *
         * * *
         * *
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        /*
         * Q2 W.A.P to sum first n even no. using while loop
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 0, sum = 0;
        while (i < n) {
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum= " + sum);

        System.out.println();
        System.out.println();

        /*
         * W.A.P to print multiplication table of given no n
         */
        System.out.print("Enter n: ");
        int l = sc.nextInt();
        for (int o = 1; o < 11; o++) {

            System.out.println(l + "X" + o + "= " + o * l);

        }
        System.out.println();
        System.out.println();

        /*
         * W.A.P to print multiplication table of 10 in reverse order
         */

        for (int j = 10; j > 0; j--) {
            System.out.println("10X" + j + "= " + j * 10);
        }
        System.out.println();
        System.out.println();
        /*
         * W.A.p to find factorial of given no. using for loop.
         */

        int fac = 1;
        int p = sc.nextInt();
        for (int j = 1; j < p + 1; j++) {
            fac *= j;
        }
        System.out.println("Factorial of " + p + " is:" + fac + " -->for loop");
        System.out.println();
        System.out.println();

        /*
         * Repeat Q5 using While loop
         */
        fac = 1;
        int m = 0;
        while (++m < p + 1) {// increment the value then use it
            fac *= m;

        }
        System.out.println("Factorial of " + p + " is:" + fac + " -->while loop");
        System.out.println();
        System.out.println();

        /*
         * Repeat Q1 using while loop
         */
        int ll = 4;

        while (ll > 0) {
            int kk = 0;
            while (kk < ll) {
                System.out.print("* ");
                kk++;
            }
            System.out.println();
            ll--;

        }
        /*
         * What can be done using one type of loop can also be done using other types of
         * loop
         * ANS- TRUE
         */

        /*
         * WAP to calculate sum of no occuring in multiplication table of 8
         */
        System.out.println();
        System.out.println();
        int sum2 = 0;
        for (int o = 1; o < 11; o++) {
            sum2 += 8 * o;
        }
        System.out.println("SUM of mul8= " + sum2);

        /*
         * A do- while loop is executed?
         * ANS- At least once
         */

        /*
         * Repeat Q2 using for loop
         */
        System.out.println();
        System.out.println();
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum3 = 0;
        for (int ii = 0; ii < num; i++) {
            sum3 += 2 * ii;

        }
        System.out.println("sum= " + sum3);
        s.close();
        sc.close();

    }
}
