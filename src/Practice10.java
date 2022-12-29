abstract class Pen {
    public abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing...");
    }

    public void refill() {
        System.out.println("Refilling...");
    }

    public void changeNib() {
        System.out.println("Nib is damaged");
    }
}

class Monkey {
    public void jump() {
        System.out.println("Monkey Jump");
    }

    public void bite() {
        System.out.println("Monkey bite");
    }
}

interface BasicAnimal {

    public abstract void eat();

    public abstract void sleep();

}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Humans eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human Sleeps");
    }

    public void greet() {
        System.out.println("Hellow Ji!");
    }
}

abstract class TelePhone {

    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();

}

class SmartTelephone extends TelePhone {

    @Override
    public void ring() {
        System.out.println("Calling Ramesh");

    }

    @Override
    public void lift() {
        System.out.println("Pick UP");

    }

    @Override
    public void disconnect() {
        System.out.println("Call ended...");

    }

    public void playGames() {
        System.out.println("Snake -===========oo> ");
    }

}

interface TVRemote {
    void nextChannel();

    void previousChannel();

    static void volUP() {
        System.out.println("Vol++");
    }

    default void volDown() {
        System.out.println("Vol--");
    }
}

interface SmartTVRemote extends TVRemote {
    void connectWifi();

    void playGames();

    void browse();
}

class TV implements SmartTVRemote {

    @Override
    public void nextChannel() {
        System.out.println("Chan>>");

    }

    @Override
    public void previousChannel() {
        System.out.println("Chan<<");

    }

    @Override
    public void connectWifi() {
        System.out.println("∞");

    }

    @Override
    public void playGames() {
        System.out.println("GTA Vice City");

    }

    @Override
    public void browse() {
        System.out.println("Ok Goole!");

    }

}

public class Practice10 {
    public static void main(String[] args) {

        FountainPen fp = new FountainPen();
        fp.write();
        ;
        fp.refill();
        ;
        fp.changeNib();

        System.out.println();
        System.out.println();

        Human women = new Human();
        women.bite();
        women.jump();
        women.eat();
        women.sleep();
        women.greet();

        System.out.println();
        System.out.println();

        BasicAnimal dog = new Human();
        // This represents our case of polymorphism in human can also act like a dog
        // only here we are giving human as only Basic animal reference
        dog.eat();
        dog.sleep();
        // dog.jump();--> produces error

        System.out.println();
        System.out.println();

        TelePhone tl = new SmartTelephone();// here smartelephone is a telephone
        tl.ring();
        tl.lift();
        // tl.playGames();
        tl.disconnect();

        System.out.println();
        System.out.println();

        TV samsung = new TV();
        samsung.connectWifi();
        samsung.nextChannel();
        samsung.playGames();
        samsung.browse();
        TVRemote.volUP();
        samsung.volDown();

    }
}
