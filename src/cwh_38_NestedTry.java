import java.util.Scanner;

public class cwh_38_NestedTry {
    private static int nextInt;

    public static void main(String[] args) {

        /*
         * Nested try-catch block can be used in case of we want to handel specific
         * exception
         * in our inner block while execte outer block at the same time
         * It helps to handel exception at diffrent levels
         * If any catch block is missing for try block then JVM will check for Outer
         * block to handel it if applicable
         */
        int[] marks = new int[] { 22, 33, 44, 55, 66 };
        System.out.print("Enter a index ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            System.out.println("Outer(Parent) TRY block");
            System.out.println("Element: " + marks[index]);

            try {
                System.out.println("Inner TRY block");
                System.out.print("Divisor: ");
                nextInt = sc.nextInt();
                System.out.println("Division: " + marks[index] / nextInt);
            } catch (ArithmeticException ar) {
                System.out.println("LEVEL-2 catch{}");
                System.out.println("Can't divide by /0");
            }

        } catch (ArrayIndexOutOfBoundsException rt) {
            System.out.println("LEVEL-1 catch{}");
            System.out.println("Index not found");

        }
        System.out.println();
        System.out.println();

        // ?If try block not has catch block for a particular exception then catch block
        // ?of outer will be excuted

        //  outer (main) try block  
        try {
            // inner try block 1   
            try {
                // inner try block 1   
                try {
                    // printing the array element out of its bounds  
                    int arr[] = { 1, 2, 3, 4, 5 };
                    System.out.println(arr[8]);

                } catch (ArithmeticException a1) {
                    //  to handle ArithmeticException 
                    System.out.println("ArithmeticException");
                    System.out.println("inner Try-Block1");
                }
            } catch (ArithmeticException a2) {
                //  to handle ArithmeticException 
                System.out.println("ArithmeticException");
                System.out.println("inner Try-Block2");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            //  to handle ArrayIndexOutOfBoundsException
            System.out.print("Exception");
            System.out.println(" outer (main) try block");

        } catch (Exception e2) {// Just for fun
            System.out.println("Exception");
            System.out.println("handled in main try-block");

        }

        sc.close();
    }
}
