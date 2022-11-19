import java.util.Scanner;

class CellPhone {
    public void ring() {
        System.out.println("Ringing");
    }

    public void vib() {
        System.out.println("Vibrating");
    }
}

class Square {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getarea() {
        return side * side;
    }

    public float getperimeter() {
        return 4 * side;
    }

}

class Rectangle {
    private float length;
    private float breadth;

    public float getLength() {
        return length;
    }

    public float getbreadth() {
        return breadth;
    }

    public void setLength(float l) {
        this.length = l;
    }

    public void setBreadth(float b) {
        this.breadth = b;
    }

    public float getarea() {
        return length * breadth;
    }

    public float getperimeter() {
        return 2 * (length + breadth);
    }

}

public class Practice7 {
    public static void main(String[] args) {
        // see class already created in cwh_14_getter_setter
        Employee emp2 = new Employee();
        emp2.set_id(87);
        emp2.set_name("Manik");
        emp2.set_salary(34004);

        System.out.println("ID is: " + emp2.get_id());
        System.out.println("Name is: " + emp2.get_name());
        System.out.println("Salary is: " + emp2.get_salary());
        System.out.println();
        System.out.println();

        CellPhone c = new CellPhone();
        c.ring();
        c.vib();
        System.out.println();
        System.out.println();

        Square ff = new Square();
        System.out.print("Enter square side: ");
        Scanner sc = new Scanner(System.in);
        float s = sc.nextFloat();
        ff.setSide(s);
        System.out.println("The side= " + ff.getSide());
        System.out.println("The side= " + ff.getarea());
        System.out.println("The side= " + ff.getperimeter());
        System.out.println();
        System.out.println();

        Rectangle fz = new Rectangle();
        System.out.print("Enter length: ");
        float l = sc.nextFloat();
        fz.setLength(l);
        System.out.println();
        System.out.print("Enter Breadth: ");
        float b = sc.nextFloat();
        fz.setBreadth(b);
        System.out.println("The length= " + fz.getLength());
        System.out.println("The breadh= " + fz.getbreadth());
        System.out.println("The area= " + fz.getarea());
        System.out.println("The perimeter= " + fz.getperimeter());
        System.out.println();
        System.out.println();

        circle c1 = new circle();
        System.out.print("Enter circle radius: ");
        float rad = sc.nextFloat();
        c1.setRadius(rad);
        sc.close();
        System.out.println("Area= " + c1.getArea());
        System.out.println("Perimeter= " + c1.getPerimeter());

    }
}
