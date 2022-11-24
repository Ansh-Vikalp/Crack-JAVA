class Alpha {
    int x = 1;
    int y;

    Alpha() {
        System.out.println("Default Constructor: Alpha ");
    }

    Alpha(int x) {
        this();
        // here value of local variable(x) get used to assign in local x only
        // while the instance x is empty so it get initialized to 0.
        // x = x;

        // Points to current instance variable.
        this.x = x;
        System.out.println("One arg Constructor: Alpha ");

    }

    Alpha(int x, int y) {
        // can also be used for constructor chaining within same class
        this(x);
        this.y = y;
        System.out.println("Two arg Constructor: Alpha ");

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Beta extends Alpha {
    int x = 9;

    Beta() {
        // super keyword can be used to acess parent class members which perhaps get
        // overiden in child class
        // it can also be used to call a parent class constructor/ meathod.
        super(77, 77);
        System.out.println("Default constructor: B " + x + "(instace var of class Beta)");
        System.out.println("Default constructor: B " + super.x + "(instace varX of class Alpha)");
        System.out.println("Default constructor: B " + super.y + "(instace varY of class Alpha)");

    }

}

public class cwh_18_thisSuper {
    public static void main(String[] args) {

        Alpha ob = new Alpha(99);
        System.out.println("X= " + ob.getX());

        Alpha obj = new Alpha(100, 66);
        System.out.println("X= " + obj.getX() + " Y= " + obj.getY());

        System.out.println();
        System.out.println();

        Beta ob4 = new Beta();
    }
}
