import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {

        /*
         * What will be the result of Following expression
         */
        float hhj = 7 / 4 * 9 / 2;// L-->R associativity also int/int=int or int*int=int
        // =1*9/2
        // =9/2
        // =4
        // =4.0(Wide Conversion)
        System.out.println(hhj);

        /*
         * W.A.P to encrypt a grade by adding 8 to it. Then Decrypt it to show correct
         * grade?
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");
        String g = sc.next();
        // sc.close();
        char gr = g.charAt(0);
        // Encrypt
        char Encrpt = (char) (gr + 8);// char + int --> int so typecast to char as whole.
        char Decrypt = (char) (Encrpt - 8);
        System.out.println("Encrpt: " + Encrpt);
        System.out.println("Decrypt: " + Decrypt);

        /*
         * Use comparision operator to find out whether a given no is greater than user
         * entered no. or not?
         */
        System.out.print("Enter a no. ");
        int d = sc.nextInt();
        System.out.println(10 > d);

        sc.close();

        /*
         * Write following expression in Java prg?
         * (v^2 - u^2)/2as
         */
        int v = 9;
        int u = 2;
        int a = 1;
        int s = 2;
        float dist = (v * v - u * u) / (2f * a * s);
        System.out.println(dist);

        /* Find the value of a in following expression */

        int asd = 7 * 49 / 7 + 35 / 7;
        // = 343/7 + 35/7
        // = 49 + 35/7
        // = 49 + 5
        // = 54
        System.out.println(asd);
    }
}