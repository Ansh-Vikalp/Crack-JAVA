
class Circle3 {
    int radius;

    Circle3(int radius) {
        this.radius = radius;
    }

    public float getAreaCircle() {
        return (float) Math.PI * radius * radius;
    }
}

class Rectangle3 {

    int length;
    int breadth;

    // Rectangle3(int l, int b) {
    // length = l;
    // breadth = b;

    // }

    public void setLength(int l) {
        length = l;

    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int recArea() {
        return length * breadth;
    }

}

class Cuboid3 extends Rectangle3 {
    int height;
    int lateralarea;
    int totalarea;
    int volume;

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid3() {
        System.out.println("............................CUBOID....................................");
    }

    // if we remove geeter and setter we can also constructor below to initialize
    // our objects

    // Cuboid3(int l, int b, int h) {
    // super(l, b);
    // System.out.println("............................CUBOID....................................");
    // this.height = h;
    // }

    public int lateralArea() {
        lateralarea = 2 * (super.length * this.height + breadth * height);
        return lateralarea;

    }

    public int totalArea() {
        lateralarea = 2 * (super.length * this.height + breadth * height + length * breadth);
        return lateralarea;

    }

    public int volume() {
        volume = recArea() * height;
        return volume;
    }
}

class Cylinder3 extends Circle3 {
    int height;
    float surfacearea;
    float totalsurfacearea;
    float volume;

    Cylinder3(int radius, int height) {
        super(radius);
        System.out.println("............................CYLINDER.................................");
        this.height = height;
    }

    public float surfaceArea() {
        surfacearea = (float) Math.PI * 2 * super.radius * height;
        return surfacearea;
    }

    public float totalSurfaceArea() {
        totalsurfacearea = surfacearea + 2 * super.getAreaCircle();
        return totalsurfacearea;
    }

    public float getVolume() {
        volume = getAreaCircle() * this.height;
        return volume;

    }
}

public class Practice9 {

    public static void main(String[] args) {

        /*
         * Q1) Create a class circle and use inheritance to create another class
         * cylinder
         * from it
         * Q2) Create a class rectangle and use inheritance to create another class
         * cuboid,
         * try to keep it as close to the real-world scenario as possible
         * Q3) Create a method for area and volume in 1
         * create methods for area & volume in 2 also create getters and setters
         * Q4) What is the order of constructor execution for the following inheritance
         * hierarchy
         * Base
         * 
         * Derived 1
         * 
         * Derived 2
         * 
         * Derived obj = new Derived 2( );
         * Which constructor(s) will be executed & in what order?
         * 
         * Answer=> The order of execution of constructors are:
         * Base()-->Derived1()-->Derived2()
         * 
         */

        Cylinder3 c1 = new Cylinder3(2, 7);
        System.out.println("Area Base: " + c1.getAreaCircle());
        System.out.println("Surface Area: " + c1.surfaceArea());
        System.out.println("Total Surface Area: " + c1.totalSurfaceArea());
        System.out.println("Volume: " + c1.getVolume());

        System.out.println();
        System.out.println();

        Cuboid3 cub = new Cuboid3();
        cub.setLength(2);
        cub.setBreadth(4);
        cub.setHeight(6);
        System.out.println("Area Base: " + cub.recArea());
        System.out.println("Lateral Area: " + cub.lateralArea());
        System.out.println("Total Area: " + cub.totalArea());
        System.out.println("Volume: " + cub.volume());

    }

}
