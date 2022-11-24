//In this tutorial we are going to see more uses of this and super keyword in java.
class Bap {
    int y;
    int z;

    Bap() {
    }

    Bap(int y, int z) {
        // this can be used to refer current instance variable of his class
        this.y = y; // y=y then local variable will be used.
        this.z = z; // z=z then local variable will be used.
    }

    Bap(cwh_18_thisSuper2 ko) {

        System.out.println("object as argument");
    }

    public void display() {
        System.out.println("display() of Bap class.");
        System.out.println("Y= " + this.y);
    }

    public void show() {
        // this can be used as reference to current obj to call a class meathod
        display();// adorns to--> this.display()--> auto done by compiler
        // If we not use this then TRADITIONAL way is:-
        // 1) Bap kko= new Bap(6);
        // kko.display(); OR,

        // 2) new Bap(8).display();
    }
    // this keyword can be used to pass argument to a meathod.

    public void takla(Betat obj) {// this can be passed as an argument to the function
        System.out.println("this as argument");
    }

}

class Betat extends Bap {

    public void show2() {
        // here super s used to call immediate parent meathod
        super.takla(this);
    }

}

public class cwh_18_thisSuper2 {

    public void ggg() {
        // passing this to constructor
        Bap hk = new Bap(this);

    }

    public static void main(String[] args) {

        Bap bb = new Bap(99, 77);
        bb.show();

        Betat hh = new Betat();
        hh.show2();

        new cwh_18_thisSuper2().ggg();

    }
}
