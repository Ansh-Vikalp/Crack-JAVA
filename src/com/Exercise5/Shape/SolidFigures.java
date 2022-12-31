package com.Exercise5.Shape;

class Cylinder extends Circle {
    int height;
    float lateralArea;

    public void getHeight() {
        System.out.println("Height= " + height);
    }

    public Cylinder(int r, int h) {
        super(h);
        System.out.println("-----------------------Cylinder--------------------");
        this.height = h;
        super.radius = r;
    }

    @Override
    public void area() {
        System.out.println("Base Area= " + (float) (Math.PI * radius * radius));
    }

    public void lateralarea() {
        lateralArea = (float) (2 * Math.PI * radius * height);
        System.out.println("Lateral Area= " + lateralArea);
    }

    public void totalArea() {
        System.out.println("Total Area= " + (lateralArea + (float) (2 * Math.PI * super.radius * radius)));
    }

    public void volume() {
        System.out.println("Volume= " + (float) (Math.PI * Math.pow(radius, 2) * height));
    }
}

class Sphere extends Circle {

    public Sphere(int radius) {
        super(radius);
        super.radius = radius;

        System.out.println("---------------------Sphere------------------------");
    }

    @Override
    public void area() {
        System.out.println("Area= " + (float) (4 * Math.PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume= " + (float) (4 / 3 * Math.PI * Math.pow(radius, 3)));
    }
}

public class SolidFigures {
}