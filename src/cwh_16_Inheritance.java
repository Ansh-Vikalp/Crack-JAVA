
class Base {
    private int x;// property

    // Meathods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void display1() {
        System.out.println("Inside Base class");
    }

}

class Derived extends Base {

    // private int x;// property of base
    private int y;// property of child

    // Meathods of base
    // public int getX() {
    // return x;
    // }

    // public void setX(int x) {
    // this.x = x;
    // }

    // if we don't use inheritance then it leads to code duplicacy. AS ABOVE!

    public void display2() {
        System.out.println("Inside Child class");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class Animal {
    private int legs;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    private String surface;

    public void setSurface(String surface) {
        this.surface = surface;
    }

    private String speed;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    void displayAnimal() {
        System.out.println("Legs= " + legs);
        System.out.println("Live on= " + surface);
        System.out.println("Speed= " + speed);
    }

}

class Dogs extends Animal {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void displayDog() {
        System.out.println("Color= " + color);
        System.out.println("Sound= " + sound);

    }

}

public class cwh_16_Inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.display1();
        b.setX(9);
        System.out.println("X= " + b.getX());

        System.out.println();
        System.out.println();

        Derived d = new Derived();
        d.display1();
        d.display2();
        d.setX(8);
        System.out.println("X= " + d.getX());
        d.setY(7);
        System.out.println("Y= " + d.getY());

        System.out.println();
        System.out.println();

        Animal a = new Animal();
        a.setLegs(4);
        a.setSpeed("Intermediary");
        a.setSurface("Land");

        a.displayAnimal();

        System.out.println();
        System.out.println();

        Dogs d1 = new Dogs();
        d1.setLegs(4);
        d1.setSurface("Land");
        d1.setSpeed("Intermediary");
        d1.setColor("Brown");
        d1.setSound("Bark");

        d1.displayAnimal();
        d1.displayDog();

    }
}
