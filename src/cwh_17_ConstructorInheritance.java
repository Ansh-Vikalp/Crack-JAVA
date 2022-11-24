class Base1 {
    Base1() {
        System.out.println("BASE class constructor: No Arg");
    }

    Base1(int a) {
        System.out.println("BASE class constructor: one arg " + a);
    }

    Base1(int a, int b) {
        System.out.println("BASE class constructor: two arg " + a + " " + b);

    }

    Base1(int a, int b, int c) {
        System.out.println("BASE class constructor: three arg " + a + " " + b + " " + c);

    }

}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("Derived class constructor: No Arg");

    }

    Derived1(int a) {

        System.out.println("DERIVED class constructor: one arg " + a);
    }

    Derived1(int a, int b) {
        super(a);
        System.out.println("DERIVED class constructor: two arg " + a + " " + b);

    }

    Derived1(int a, int b, int c) {
        super(a, b);
        System.out.println("DERIVED class constructor: three arg " + a + " " + b + " " + c);

    }

}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("DERIVED2 class constructor: no arg");
    }
}

public class cwh_17_ConstructorInheritance {
    public static void main(String[] args) {
        // Always base class constructor get called first then child class constructor
        // get called.

        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(2);
        Derived1 d3 = new Derived1(9, 8);
        Derived1 d4 = new Derived1(7, 6, 5);
        Derived2 dd1 = new Derived2();

    }
}
