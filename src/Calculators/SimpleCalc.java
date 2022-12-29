package Calculators;

public class SimpleCalc {
    private int x;
    private int y;

    public void setter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        System.out.println("Addition: " + (x + y));
    }

    public void sub() {
        System.out.println("Substraction: " + (x - y));
    }

    public void mul() {
        System.out.println("Multiplication: " + (x * y));
    }

    public void div() {
        System.out.println("Division: " + (x / y));
    }

}
