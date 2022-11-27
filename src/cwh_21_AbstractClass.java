abstract class Shape {// 🧡 class quantified with abstract keyword

    Shape() {
        System.out.println("...................SHAPE.......................");
    }

    // Concreate meathod
    final public void isClosed() {
        System.out.println("This is closed figure");
    }

    // Abstract Meathods
    abstract public void sides();

    abstract public void area();

    abstract public void perimeter();

}

class Circle455 extends Shape {
    // body is implemented

    @Override
    public void sides() {
        System.out.println("Circle has 0 sides");

    }

    public void area() {
        System.out.println("Circle area= PI.radius*radius");

    }

    @Override
    public void perimeter() {
        System.out.println("Circle perimeter= 2*PI*radius");

    }

}

class Rectangle455 extends Shape {
    public void sides() {
        System.out.println("Rectangle has 4 sides");
    }

    @Override
    public void area() {
        System.out.println("Rectangle area= length*breadth");
    }

    @Override
    public void perimeter() {
        System.out.println("Rectangle Perimeter= 2*(length+breadth)");
    }
}

class Triangle extends Shape {

    @Override
    public void sides() {
        System.out.println("Triangle has 3 sides");

    }

    @Override
    public void area() {
        System.out.println("Triangle area= 1/2(length*height)");

    }

    @Override
    public void perimeter() {
        System.out.println("Triangle perimeter= a+b+c");

    }

}

public class cwh_21_AbstractClass {
    public static void main(String[] args) {
        // Shape is a abstract class
        // Shape s= new Shape();//❌ NOT Allowed- Cannot instantiate the type Shape
        // Java(16777373)

        // ✅ We can't initiate an abstract class but it can be sub-classed.
        Rectangle455 r = new Rectangle455();
        r.isClosed();
        r.sides();
        r.area();
        r.perimeter();

        System.out.println();
        System.out.println();

        Circle455 c = new Circle455();
        c.isClosed();
        c.sides();
        c.area();
        c.perimeter();

        System.out.println();
        System.out.println();

        Triangle t = new Triangle();
        t.isClosed();
        t.sides();
        t.area();
        t.perimeter();

    }
}
