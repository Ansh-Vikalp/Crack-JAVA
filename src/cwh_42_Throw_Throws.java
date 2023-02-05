class NegativeDimensionException extends Exception {
    // ! Custom Negative Dimension Exception Sepicific
    public NegativeDimensionException(String m) {
        super(m);
    }
}

public class cwh_42_Throw_Throws {

    // ! Implicit exception Meathod
    public static int divide(int a, int b) throws ArithmeticException {
        // ? If we not write throws here then is also run() but we need to be sure there
        // ? is try{}-catch(){} block inside main
        return a / b;
    }

    // ! ArithmeticException Handeled in fun() itself no need of throws
    public static int divide2(int a, int b) {
        int c = -1;
        try {
            c = a / b;

        } catch (Exception e) {

            System.out.println(e.getMessage() + " <Handeled in fun itself>");
        }
        return c;
    }

    // ! User-defined NegativeDimensionException
    public static float areaCircle(int radius) throws NegativeDimensionException {
        if (radius < 0)
            throw new NegativeDimensionException("Radius must not be negative!");
        return (float) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Division= " + divide(2, 0));
        } catch (ArithmeticException w) {
            System.out.println(w + " <Inside Main>");
        }

        System.out.println();
        divide2(3, 0);

        System.out.println();

        try {
            System.out.println("Area= " + areaCircle(-22));
        } catch (NegativeDimensionException e) {
            System.out.println("<Inside Main>");
            e.printStackTrace();
        }
    }
}
