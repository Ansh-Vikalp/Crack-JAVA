import java.util.Scanner;

class ExceptionalCalculator {
    private int a;
    private int b;

    public ExceptionalCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int substract() {
        return a - b;
    }

    public int multiply() throws MaxMultipilerReachedException {
        if (a * b > 7000)
            throw new MaxMultipilerReachedException("Multiplication Result is too large");
        return a * b;
    }

    public int division() throws CanNotDivideByZeroException {
        if (b == 0)
            throw new CanNotDivideByZeroException("/ by 0 not allowed");
        return a / b;
    }

    public void operations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a= " + this.a + "\tb= " + this.b);
        try {
            if (a > 100000 || b > 100000)
                throw new MaxInputException("Input no are large!");

            try {

                int i = 4;
                while (i > 0) {
                    System.out.print("Enter operator ");
                    String operator = sc.nextLine();

                    switch (operator) {
                        case "+":
                            System.out.println("SUM= " + this.sum());

                            break;

                        case "-":
                            System.out.println("Substract= " + this.substract());

                            break;

                        case "*":
                            System.out.println("Multiplication= " + this.multiply());

                            break;

                        case "/":
                            System.out.println("Division= " + this.division());

                            break;

                        default:
                            throw new InvalidInputException("Operator is not valid!");

                    }

                    i--;
                }

            } catch (MaxMultipilerReachedException e) {
                // TODO: handle exception
                System.out.println(e);
            }

            catch (CanNotDivideByZeroException e) {
                // TODO: handle exception
                System.out.println(e);
            } catch (InvalidInputException e) {
                System.out.println(e);
            }

        } catch (MaxInputException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

class MaxMultipilerReachedException extends Exception {
    public MaxMultipilerReachedException(String msg) {
        super(msg);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}

class CanNotDivideByZeroException extends Exception {
    public CanNotDivideByZeroException(String msg) {
        super(msg);

    }
}

class MaxInputException extends Exception {
    public MaxInputException(String msg) {
        super(msg);

    }
}

public class Exercise5 {
    // Exceptional Calculator
    public static void main(String[] args) {
        /*
         * You have to create a custom calculator with followinng operations:
         * AddiTion
         * Substraction
         * Multiplication
         * Division
         * which throws following exceptions:=
         * InvalidInputException(Ex 5 & 7)
         * CanNotDivideByZeroException
         * MaxInputException if input is >100000
         * MaxMultipilerReachedException Dont allow any multiplication to be greater
         * than 7000;
         */

        ExceptionalCalculator c1 = new ExceptionalCalculator(5, 3); // InvalidInputException(Ex 5 & 7)
        c1.operations();
        System.out.println();
        System.out.println();

        ExceptionalCalculator c2 = new ExceptionalCalculator(5, 0);// CanNotDivideByZeroException
        c2.operations();
        System.out.println();
        System.out.println();

        ExceptionalCalculator c3 = new ExceptionalCalculator(1000000, 0);// MaxInputException
        c3.operations();
        System.out.println();
        System.out.println();

        ExceptionalCalculator c4 = new ExceptionalCalculator(700, 500);// MaxMultipilerReachedException
        c4.operations();

    }
}
