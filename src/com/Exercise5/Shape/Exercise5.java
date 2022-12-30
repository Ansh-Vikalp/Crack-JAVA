package com.Exercise5.Shape;

/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */

class Rectangle {
    protected int length;
    protected int breadth;

    public Rectangle() {
        System.out.println("---------------------Rectangle---------------------");
    }

    public Rectangle(int o) {
    }

    public void setter(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void getter() {
        System.out.println("Length= " + length);
        System.out.println("Breadth= " + breadth);
    }

    public void perimeter() {
        System.out.println("Perimeter= " + 2 * (length + breadth));
    }

    public void area() {
        System.out.println("Area= " + (length * breadth));
    }
}

class Square {
    protected int side;

    public Square() {
        System.out.println("---------------------Square------------------------");
    }

    public Square(int o) {
    }

    public void setter(int s) {
        this.side = s;
    }

    public void getter() {
        System.out.println("Side= " + side);

    }

    public void perimeter() {
        System.out.println("Perimeter= " + 4 * (side));
    }

    public void area() {
        System.out.println("Area= " + (side * side));
    }

}

class Circle {
    protected int radius;

    public Circle() {
        System.out.println("---------------------Circle---------------------");
    }

    public Circle(int o) {
    }

    public void setter(int r) {
        this.radius = r;
    }

    public void getter() {
        System.out.println("Radius= " + radius);

    }

    public void perimeter() {
        System.out.println("Perimeter= " + (float) (2 * Math.PI * radius));
    }

    public void area() {
        System.out.println("Area= " + (float) (Math.PI * radius * radius));
    }

}

public class Exercise5 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setter(5, 4);
        r.getter();
        r.perimeter();
        r.area();

        System.out.println();
        System.out.println();

        Square s = new Square();
        s.setter(5);
        s.getter();
        s.perimeter();
        s.area();

        System.out.println();
        System.out.println();

        Cylinder cc = new Cylinder(2, 5);
        cc.getter();
        cc.getHeight();
        cc.area();
        cc.lateralarea();
        cc.totalArea();
        cc.volume();

        System.out.println();
        System.out.println();

        Sphere dd = new Sphere(6);
        dd.getter();
        dd.area();
        dd.volume();

    }

}
