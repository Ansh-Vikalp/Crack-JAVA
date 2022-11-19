import java.util.Scanner;

class Employee {
    // Data Hiding
    private int id;
    private String name;
    private int salary;

    // setter Meathod
    public void set_id(int i) {
        this.id = i;// Points to current instance variable
    }

    public void set_name(String n) {
        name = n;
    }

    public void set_salary(int s) {
        salary = s;
    }

    // Getter Meathod
    public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public int get_salary() {
        return salary;
    }
}

class circle {
    private float radius;
    private float perimeter;
    private float area;

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        area = 22 / 7 * radius * radius;
        return area;
    }

    public float getPerimeter() {
        perimeter = 2 * 22 / 7 * radius;
        return perimeter;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}

public class cwh14_Getter_Setter {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.set_id(27);
        emp1.set_name("Ansh Vikalp");
        emp1.set_salary(250000);

        System.out.println("ID is: " + emp1.get_id());
        System.out.println("Name is: " + emp1.get_name());
        System.out.println("Salary is: " + emp1.get_salary());
        System.out.println();
        System.out.println();

        circle c1 = new circle();
        System.out.print("Enter circle radius: ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        c1.setRadius(rad);
        sc.close();
        System.out.println("Area= " + c1.getArea());
        System.out.println("Perimeter= " + c1.getPerimeter());

    }

}
