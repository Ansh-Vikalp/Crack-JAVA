import java.util.Scanner;

public class cwh_7_Loops {
    public static void main(String[] args) {
        // Loops in Java

        // 1) While Loop

        int i = 0;
        while (i < 5) {
            System.out.println("I love JAVA " + i);
            i++;
        }

        // Case of infinite while loop

        // int a = 3;
        // while (a < 5) { // or while(true)
        // System.out.println("I love JAVA " + i);

        // }

        // 2) do-While loop
        // this loop execute atleast once even if cond is false
        int j = 7;
        do {
            System.out.println("I am a programmer " + j);
            j++;
        } while (j < 5);

        // 3) for loop

        for (int j2 = 0; j2 < 5; j2++) {
            System.out.println(j2);

        }

        int g = 100;
        while (g < 201) {
            System.out.println(g);
            g++;
        }
        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        int y = 1;
        do {
            System.out.println(y);
            y++;
        } while (y < n + 1);
        System.out.println();
        System.out.println();

        for (int k = 0; k < n; k++) {
            System.out.println(2 * k + 1);
        }
        System.out.println();
        System.out.println();

        for (int u = n - 1; u >= 0; u--) {
            System.out.println(2 * u + 1);
        }
        System.out.println();
        System.out.println();

        // Break & Continue statements

        for (int k = 0; k < 11; k++) {
            System.out.println("No " + k);
            // It is commonly seen that we place the main body of loop before any break
            // block so that the body first printed then a message is shown reson of break

            if (k == 5) {
                System.out.println("Terminating the loop");
                break;
            }
        }

        System.out.println();
        System.out.println();
        int z = 0;// continue skips a iteration
        /**
         * If you try to guess the result of code you say(1,2,3,4,5,6) but it is wrong
         * The o/p will be- 1,2,3,4,5,6,7
         * Why?
         * see the expression z++ !=7 carefully note, ! and ++ is of same precedence
         * but the associativity is R-->L
         * Thus the actual exp is:- 7!= z++;
         * thus 1st check is performed then increment is done
         * 7!=0++ 7!=1++ 7!=2++ ... 7!=6++(but this time z becomes 7 while entring the
         * loop so 7 get printed)
         * To avoid it use ++z and exp will be 7!= ++z
         * 
         **/
        while (z++ != 7) {
            if (z == 5) {
                System.out.println("Skipped");
                continue;
            }
            System.out.println("People " + z);

        }

    }
}
