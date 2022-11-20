class Cylinder {
    private float radius;
    private float height;

    public Cylinder() {
    }

    public Cylinder(float rad, float hei) {
        this.radius = rad;
        this.height = hei;

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void surface() {
        float arr = 2 * (float) Math.PI * radius * height;

        System.out.println("Surface Area= " + arr);
    }

    public void volume() {
        float vol = (float) Math.PI * radius * radius * height;

        System.out.println("Volume= " + vol);
    }

}

class Rectangle2 {
    private int length;
    private int breadth;

    public Rectangle2() {
        this.length = 4;
        this.breadth = 3;
    }

    public Rectangle2(int l, int b) {
        length = l;
        breadth = b;
    }

    public int displayArea() {
        return length * breadth;
    }
}

class Sphere {
    private float radius;

    public Sphere() {
    }

    public Sphere(float rad) {
        this.radius = rad;

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void surface() {
        float arr = 4 * (float) Math.PI * radius * radius;

        System.out.println("Surface Area= " + arr);
    }

    public void volume() {
        float vol = (float) Math.PI * radius * radius * radius * 4 / 3;

        System.out.println("Volume= " + vol);
    }

}

public class Practice8 {
    public static void main(String[] args) {
        /*
         * Q1) create a class cylinder and use getter and setters to set its radius and
         * height.
         * Q2) use ➊ to calculate surface and volume of the cylinder.
         * Q3) Use a constructor and repeat ➊
         * Q4) Overload a constructor used to initialize a rectangle of length and
         * breath for using custom parameters
         * Q5) Repeat ➊ for a sphere.
         */
        Cylinder c1, c2;
        c1 = new Cylinder();
        c1.setHeight(12f);
        c1.setRadius(12.5f);
        System.out.println("Height= " + c1.getHeight() + " Radius= " + c1.getRadius());
        c1.surface();
        c1.volume();
        System.out.println();
        System.out.println();
        c2 = new Cylinder(2.33f, 5.6f);
        System.out.println("Height= " + c2.getHeight() + " Radius= " + c2.getRadius());
        c2.surface();
        c2.volume();

        System.out.println();
        System.out.println();
        Rectangle2 r = new Rectangle2();
        System.out.println("AREA{ " + r.displayArea());
        Rectangle2 r2 = new Rectangle2(7, 5);
        System.out.println("AREA{ " + r2.displayArea());

        System.out.println();
        System.out.println();

        Sphere dd = new Sphere(2);
        dd.surface();
        dd.volume();

    }
}
