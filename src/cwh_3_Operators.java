public class cwh_3_Operators {
    public static void main(String[] args) {
        // Operators in JAVA

        // 👉 Arithmetic operator

        int a = 5;
        int b = 4;
        int c = a + b;// +, -, /, *, %
        float d = 6.7f % 1.1f; // gives o/p--> 0.1(Modulo op can also gives decimal values)
        System.out.println(c);
        System.out.println(d);

        // 👉 Assignment operator

        int h = 9;
        h -= 3; // equivalent to: h= h-3 -->9-3=6
        System.out.println(h);

        // 👉 Unary operator
        int t = -6; // here - is unary operator(case of operator overloading)
        t = +5;
        System.out.println(h++ + " " + t);

        // 👉 Relational OR Comparision Operator
        System.out.println(9 <= 3);
        System.out.println(9 != 3);

        // 👉 Logical operator
        System.out.println(9 > 5 && 8 < 10);
        System.out.println(9 != 0);

        // 👉 Bitwise Operator(&, |, ^, ~)
        int y = 2; // 10
        int n = 3; // 11
        System.out.println(y & ~n);// (0&~1)=0 (1&~1)=0 so result is 00 -> 0 in decimal

        // 👉 Shift Operator(<<, >>)
        int o = n << 1; // multiply no. with power of 2 HERE o= 3 * 2^1;
        o = o >> 1;
        System.out.println(o);// These operator can only operates on int value.

        // 👉 Ternary Operator
        int r = 2;
        int op = 5;
        int greater = (op > r) ? op : r;
        System.out.println(greater);

    }
}
