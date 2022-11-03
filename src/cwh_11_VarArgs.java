public class cwh_11_VarArgs {
    // Overloaded 1
    // public static int sum(int a, int b) {
    // int res = 0;
    // res = a + b;
    // return res;
    // }

    // Overloaded 2
    // public static int sum(int a, int b, int c) {
    // int res = 0;
    // res = a + b + c;
    // return res;
    // }

    // Overloaded 3
    // public static int sum(int a, int b, int c, int d) {
    // int res = 0;
    // res = a + b + c + d;
    // return res;
    // }

    // Overloaded 4
    // public static int sum(int a, int b, int c, int d, int e) {
    // int res = 0;
    // res = a + b + c + d + e;
    // return res;
    // }

    public static int oneManArmy(int... arr) {
        // if we call oneManArmy() without any value then all elements in array got
        // initialized by default of 0
        int res = 0;
        // here arr is just int[] arr;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    public static int twoManArmy(int X, int... drr) {
        // one arg is necessary at time of call(X);
        int yu = 0;
        yu += X;// one parameter already added
        // yu= X+ arg1+ arg2+ arg3+ arg4+ ... +argn
        for (int i : drr) {
            yu += i;
        }

        return yu;
    }

    public static void main(String[] args) {
        // Variable Arguments(VarArgs) in JAVA
        /*
         * Many times we don't want to have multiple overloaded
         * functions for different no of arguments. In that case we make use of
         * only one single meathod that can take variable no. of arguments.
         * The f/n() is called as VarArgs. It stores all it's value in form of array.
         * SEE below condn:-
         */
        // System.out.println("Without varargs");
        // System.out.println("The sum of 2 & 3 is: " + sum(2, 3));
        // System.out.println("The sum of 2, 3 & 4 is: " + sum(2, 3, 4));
        // System.out.println("The sum of 2, 3, 4 & 5 is: " + sum(2, 3, 4, 5));
        // System.out.println("The sum of 2, 3, 4, 5 & 6 is: " + sum(2, 3, 4, 5, 6));

        System.out.println("When purely varargs is used");
        System.out.println("The sum of nothing is: " + oneManArmy());
        System.out.println("The sum of 2 & 3 is: " + oneManArmy(2, 3));
        System.out.println("The sum of 2, 3 & 4 is: " + oneManArmy(2, 3, 4));
        System.out.println("The sum of 2, 3, 4 & 5 is: " + oneManArmy(2, 3, 4, 5));
        System.out.println("The sum of 2, 3, 4, 5 & 6 is: " + oneManArmy(2, 3, 4, 5, 6));

        System.out.println();
        System.out.println();

        System.out.println("When varargs + primitive type is used");
        // System.out.println("The sum of nothing is: " + twoManArmy());❌
        System.out.println("The sum of 2 & 3 is: " + twoManArmy(2, 3));
        System.out.println("The sum of 2, 3 & 4 is: " + twoManArmy(2, 3, 4));
        System.out.println("The sum of 2, 3, 4 & 5 is: " + twoManArmy(2, 3, 4, 5));
        System.out.println("The sum of 2, 3, 4, 5 & 6 is: " + twoManArmy(2, 3, 4, 5, 6));
    }
}