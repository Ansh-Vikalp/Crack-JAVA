interface Father {
    public abstract void bloodGroup();

    public static void hair() {
        System.out.println("color of hair Black");
    }
}

interface Mother {
    public abstract void bloodGroup();

    public static void skin() {
        System.out.println("Skin is fair");
    }
}

// an interface can extends another interface
interface MotherSister extends Mother {
    public abstract void eye();
}

class MotherSisterChild implements MotherSister {
    public void bloodGroup() {
        System.out.println("Child of Mother Sister blood Group is A+");
    }

    public void eye() {
        System.out.println("Child of Mother Sister eye's color is blue");
    }
}

public class cwh_23_MultipleInheritance implements Father, Mother {

    public void bloodGroup() {
        System.out.println("Blood group of child is O+");
    }

    public static void main(String[] args) {
        // interface support the concept of mutiple inheritance

        cwh_23_MultipleInheritance child = new cwh_23_MultipleInheritance();
        System.out.println("------------CHILD born from PARENTS------------");
        child.bloodGroup();
        Father.hair();
        Mother.skin();

        MotherSisterChild ms = new MotherSisterChild();
        System.out.println("------------------CHILD of Mother's Sister---------------------");
        ms.bloodGroup();
        ms.eye();

    }

}
