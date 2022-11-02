import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /*
         * Create an array of 5 floats and calculate their sum.
         */
        float haj[] = new float[] { 1.2f, 1.3f, 1.5f, 1.6f, 1.7f };
        float sum = 0.0f;
        for (float f : haj) {
            sum += f;

        }
        System.out.println("sum of floats= " + sum);

        /*
         * WAP to find out whether a given integer is present in an array or not
         */
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int[] daka = { 23, 25, 27, 28, 29, 30, 31, 32 };

        for (int i = 0; i < daka.length; i++) {
            if (element == daka[i]) {
                System.out.println("Element found at position " + (i + 1));
                break;
            }
        }

        /*
         * Calculate the average marks from an array containing marks of all students
         * in
         * physics using for
         * each loop
         */
        float avg;
        int sum3 = 0;

        for (int i : daka) {
            sum3 += i;
        }

        avg = sum3 / (float) daka.length;// typecasting
        System.out.println("Average marks: " + avg);
        /*
         * Create a java program to add two matrices of size 2x3
         */
        int[][] ff = new int[2][3];
        int[][] uu = new int[2][3];
        System.out.println("Enter 1st matrix");
        for (int i = 0; i < ff.length; i++) {
            for (int j = 0; j < ff[i].length; j++) {
                ff[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter 2nd matrix");
        for (int i = 0; i < uu.length; i++) {
            for (int j = 0; j < uu[i].length; j++) {
                uu[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Addition of matrices are:");

        for (int i = 0; i < uu.length; i++) {
            for (int j = 0; j < uu[i].length; j++) {
                System.out.print(ff[i][j] + uu[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println();
        /*
         * Write a java prgram to reverse an array
         */
        for (int i = daka.length - 1; i > -1; i--) {
            System.out.print(daka[i] + " ");

        }
        System.out.println();
        System.out.println();
        /*
         * Write a java prg to find maximum & minimum element in an array
         */
        int max = uu[0][0];
        int min = uu[0][0];
        for (int i = 0; i < uu.length; i++) {
            for (int j = 0; j < uu[i].length; j++) {
                if (max < uu[i][j]) {
                    max = uu[i][j];

                }
                if (min > uu[i][j]) {
                    min = uu[i][j];
                }
            }
        }
        System.out.println("Maximum element in matrix: " + max);
        System.out.println("Minimum element in matrix: " + min);
        sc.close();

        /*
         * W.A.P to find whether an array is sorted or not
         */
        int[] oo = new int[] { 1, 2, 0, 4 };

        for (int i = 0; i < oo.length - 1; i++) {
            if (oo[i] > oo[i + 1]) {
                System.out.println("Array is not sorted!");
                break;
            }
        }

    }
}
