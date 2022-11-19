//In one file there must be only one public class whose name is file name also

class Employee1 {
    // Attributes
    int id;
    String name;
    int salary;

    // Meathods
    public void get_details() {
        System.out.println("ID is: " + id);
        System.out.println("Name is: " + name);
    }

    public void get_salary() {
        System.out.println("Salary is: " + salary);
    }
}

public class cwh_13_OOPS {
    public static void main(String[] args) {

        // Employee emp1 = new Employee();// Instantiating a new Employee Object
        // emp1.id = 27;// Not a good way to access directely
        // emp1.name = "Ansh Vikalp";
        // emp1.salary = 23000;

        // System.out.println("Employee 1");
        // System.out.println("ID= " + emp1.id + "\nName= " + emp1.name + "\nSalary= " +
        // emp1.salary);

        Employee1 emp2 = new Employee1();
        emp2.id = 28;
        emp2.name = "Anshika";
        emp2.salary = 12000;
        emp2.get_details();
        emp2.get_salary();

        // 🧧 NOTE(VVIMP):- if you using all meathods(including main) and properties in
        // one class only that is public
        // then you can use private modifier with properties as well as f/n as it
        // accsessible only in that class.

        // But you defining a custom class other than public modifier and using its
        // meathod in class containing main the
        // your f/n need to be public & you could use public/private with properties.🧧

    }
}
