
class Employee23 {
    private int id;
    private String name;
    private float salary;

    // Default constructor
    public Employee23() {
        id = 00;
        name = "Your-Name-Here";
        salary = 0.0f;

    }

    // initalizes obj with fixed name&salary but user paramer name
    public Employee23(int idd) {
        this.id = idd;
        name = "Amit";
        salary = 23.55f;
    }

    // initalizes obj with fixed salary but user paramer (name, idd)
    public Employee23(int idd, String g) {
        this.id = idd;
        name = g;
        salary = 10000.55f;
    }

    // All user paramer
    public Employee23(int i, String string, int j) {
        this.id = i;
        this.name = string;
        this.salary = j;
    }

    public float getSalary() {
        return salary;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    // public void setSalary(float salary) {
    // this.salary = salary;
    // }

    // public void setID(int i) {
    // this.id = i;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

}

public class cwh_15_Constructors {
    public static void main(String[] args) {
        // CONSTRUCTORS:- A member function used to initialize object while creating it.
        // It helps to avoid making getter and setters for each properties of class.
        // It has same name as of class & used to give memory to our object
        // It automatically get invoked.

        // Traditional way
        // Employee23 obj = new Employee23();
        // obj.setID(9);
        // obj.setName("Ansh vikalp");
        // System.out.println("ID: "+obj.getID()+" Name: "+obj.getName());

        // Condensed way:-
        Employee23 emp1 = new Employee23();// it initalizes to default value
        System.out.println("NAME= " + emp1.getName());
        System.out.println("ID= " + emp1.getID());
        System.out.println("SALARY= " + emp1.getSalary());
        System.out.println();
        System.out.println(); // OVERLOADING CONSTRUCTORS()

        Employee23 emp2 = new Employee23(2);// 1 Parameter
        System.out.println("NAME= " + emp2.getName());
        System.out.println("ID= " + emp2.getID());
        System.out.println("SALARY= " + emp2.getSalary());
        System.out.println();
        System.out.println();

        Employee23 emp3 = new Employee23(2, "Hariom");// 2 Parameter
        System.out.println("NAME= " + emp3.getName());
        System.out.println("ID= " + emp3.getID());
        System.out.println("SALARY= " + emp3.getSalary());
        System.out.println();
        System.out.println();

        Employee23 emp4 = new Employee23(2, "Hariom", 20000);// 3 Parameter
        System.out.println("NAME= " + emp4.getName());
        System.out.println("ID= " + emp4.getID());
        System.out.println("SALARY= " + emp4.getSalary());

    }

}
