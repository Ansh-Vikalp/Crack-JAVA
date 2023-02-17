package AccessModifiers.Modifiers;

class Joker { // we can't extend this class in another package as it is default and not public
              // also on file can only have on public class.
    public int x = 99;
    protected int y = 88;
    int z = 77;
    private int a = 33;

    // CASE OF VISIBILITY IN SAME CLASS
    public void show() {
        // 📌 All modifers are accessible within same class
        System.out.println("public: " + x);
        System.out.println("protected: " + y);
        System.out.println("default: " + z);
        System.out.println("private: " + a);
    }

}

// Note here class Joker and cwh_25_AccessModifiers are in same package of
// MODIFiers.
// We can even place these two files belonging to same package.
public class cwh_25_AccessModifiers {

    // feilds of cwh_25_AccessModifiers
    public int cwh_25_x = 99;
    protected int cwh_25_y = 88;
    int cwh_25_z = 77;
    private int cwh_25_a = 33;

    public static void main(String[] args) {

        Joker j = new Joker();
        // j.show();

        // CASE OF VISIBILTY IN SAME PACKAGE
        System.out.println("Joker's public: " + j.x);
        System.out.println("Joker's protected: " + j.y);
        System.out.println("Joker's default: " + j.z);
        // ❌ Private members are only accessible within same package
        // System.out.println("Joker's private: " + j.a);

    }
}
