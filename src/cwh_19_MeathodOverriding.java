class Super { // MEATHOD OVERRIDING in JAVA

    public void metd1() {// get Overridden
        System.out.println("Base class mtd1()");
    }

    public final void metd2() {// not get overridden(Inherited directly)
        System.out.println("Base class mtd2()");
    }

    public Daddy jok() {// overriden with varing return type
        System.out.println("jok is jok");
        return new Daddy();
    }
}

class Sub extends Super {

    @Override // this annotation ensures that we are overriding our meathod and thus it's
    // signature must be same.
    // any change in declaration shows error
    public void metd1() {// this is overridden meathod.
        System.out.println("Child class mtd1()");
    }

    public int metd3() {// this is specialized meathod that is unique to sub-class only
        System.out.println("Child class mtd3()");
        return 4;
    }

    @Override
    public Baccha jok() {
        System.out.println("jok is OVERRIDDEN with CO-VARIENT TYPE");
        return new Baccha();
    }
}

class Daddy {
}

class Baccha extends Daddy {
}

public class cwh_19_MeathodOverriding {

    public static void main(String[] args) {

        Super u = new Super();
        u.metd1();
        u.metd2();

        System.out.println();
        System.out.println();

        Sub ii = new Sub();
        ii.metd1();
        ii.metd2();
        ii.metd3();
        ii.jok();

    }

}
