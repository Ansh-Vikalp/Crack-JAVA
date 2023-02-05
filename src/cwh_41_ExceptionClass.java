import java.util.Scanner;

class NegativeNumberException extends Exception {

    // ? Recommended & Best approarch
    public NegativeNumberException(String message) {
        super(message);
    }

}

class MyException extends Exception {
    /**
     ** The Exception class contains many important meathods that we can ise to
     ** display error message in diffrent forms-
     * ! Exception e
     * ? 1) e.tostring() or Sout(e); --> Covert the Unchecked Exception identified
     * ? 2) e.getMessage(); --> Only shows msg
     * ? 3) e.printStackTrace(); --> prints Tree representation of Exception with
     * ? Line no.
     */

    @Override
    public String toString() {
        return "I am toString() of MyException{}";
    }

    @Override
    public String getMessage() {
        return "I am getMessage() of MyException{}";
    }
}

public class cwh_41_ExceptionClass {
    private static float average;

    public static void main(String[] args) {
        // Now we will see how to create our own exceptions and use of throw keyword
        // Consider a case of calculation of average maks of a student

        int[] arr = new int[] { 12, 13, 15, -23, 44 };

        /**
         * 🧨Here three types of exceptions are possible-
         * !ArrayIndexOutOfBoundException
         * ! ArithmeticException
         * ! NegativeMarksException
         * *Of course we can easily identify & handel Arithmetic and Array Exception but
         * *Negative no can't be identified by our Jvm
         * *as it does not have any exceptional class for it.So Java allow us to throw
         * *an exception explicitely using throw keyword.
         * ? 🐥SYNTAX- throw new <class_name> ("error message");
         */
        int sumMarks = 0;
        int totalSubjects = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    // ? "Surely we can throw -ve Exception by Exception class but, to be more
                    // ? specific Java also allow us to create user-defined Exception."
                    // ! Custom Exception can be created by extending the Exception class
                    // throw new Exception("Marks must not be negative!");//✍Meathod-1
                    throw new NegativeNumberException("Marks must not be negative!");// ✍Method-2

                }
                ++totalSubjects;
                sumMarks += arr[i];
            }
            average = (float) sumMarks / totalSubjects;
            System.out.println("Average marks: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Range");
        } catch (ArithmeticException e) {
            System.out.println(e);
            // this adorns to e.toString() meathod of Exception class @Overriden in
            // Arithmetic Exception class

        } catch (Exception e) {
            System.out.println("getMessage(): " + e.getMessage() + "\n");
            System.out.println(e.toString() + "\n");
            System.out.println("printStackTrace()");
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Age Bata: ");
        int age = sc.nextInt();
        sc.close();

        try {

            if (age > 125) {
                throw new MyException();
            }

            else {
                System.out.println("Darr mat abhi nahi marega tu!");
            }

        } catch (MyException my) {
            System.out.println(my.toString());
            System.out.println(my.getMessage());
        }

    }
}
