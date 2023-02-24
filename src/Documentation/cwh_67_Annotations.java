package Documentation;

import org.junit.Assert;
import org.junit.Test;

class Flower {

    public void getInfo() {
        System.out.println("This is a flower.");
    }

    @Deprecated
    public boolean isEdible() {
        return true;
    }

}

class Rose extends Flower {
    @Override
    public void getInfo() {
        System.out.println("This is a Rose.");

    }

    /**
     * ! The method getInfo() of type Rose must override or implement a supertype
     * ! method
     * 
     * @Override
     *           public int getInfo() {}
     */

}

@FunctionalInterface
interface Ram {
    void showData();

    // void showData2(); Uncomment then 2nd abstract meathod gives error of not a
    // Functional Interface
    static void display() {
    };

    default int raff() {
        return 9;
    };

}

public class cwh_67_Annotations {

    @Test
    public void tester() {
        Assert.assertTrue(new Flower().isEdible());
    }

    @Deprecated
    public void sum(int a, int b) {
        System.out.println("Sum= " + (a + b));
    }

    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        /*
         * //! Annotations
         * Annotation in java are the special words which provide some extra information
         * about the block of code.
         * These are simply METADATA(data about data) to classes, interfaces, variables,
         * methods, or fields.
         * //? After, encountering a Annotation the compiler changes it's behaviour from
         * //? a normal way of Interpretation
         * Some common Annotations :-
         * a) @Override- used to indicate a meathod is being overridden of super class
         * b) @Deprecated- used to indicate meathod/class is now deprecated.
         * c) @SupressWarning("[[Warning]]")- used to supress the generated warning by
         * the compiler.Java groups warnings under two categories. They are deprecated
         * and unchecked. Any unchecked warning is generated when a legacy code
         * interfaces with a code that uses generics.
         * d)@FunctionalInterface- used to mark an interface as func. interface
         * e)@Test- to mark a meathos as Test meathod of Test class.
         */

        Flower f = new Rose();
        f.getInfo();

        /*
         * javac cwh_67_Annotations.java
         * Note: cwh_67_Annotations.java uses or overrides a deprecated API.
         * Note: Recompile with -Xlint:deprecation for details.
         */

        System.out.println(f.isEdible());

        cwh_67_Annotations obj = new cwh_67_Annotations();
        obj.sum(3, 4);

        // ArrayList err = new ArrayList();

    }
}
