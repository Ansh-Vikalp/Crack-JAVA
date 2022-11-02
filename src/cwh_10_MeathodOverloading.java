public class cwh_10_MeathodOverloading {
    public static void foo() {
        System.out.println("Zero argument");
    }

    public static void foo(int a) {
        System.out.println(a + " argument");
    }

    public static void foo(int a, int b) {
        System.out.println(a + " argument " + b);
    }
    // on changing return type only f/n not get overloaded
    // public static int foo(int a, int b){
    // System.out.println(a+" argument "+b);
    // }

    public static void main(String[] args) {
        // Meathod Overloading
        // when two or more fun has same name but diffrent parameter(signatures).
        // Meathod signature= Meathod name + Parameter List
        // It can't achieved by changing return type.

        foo();
        System.out.println();
        foo(1);
        System.out.println();
        foo(1, 2);

    }
}
