import java.util.Arrays;

interface ReserveBank {
    // the feilds can be constant only i.e. public-static-final
    public static final String est = "1/April/1935";

    abstract void rateOfInterset();// Compiler: public abstract void rateOfInterest();

    abstract void bankName();// Compiler: public abstract void bankName();

    void vendors();// Compiler: public abstract void vendors();

    // Java8 allows creation of static and default meathods in interface
    public static void location() {

        System.out.println("\n---------Affiliated From---------");
        System.out.println("Reserve Bank of India");
        System.out.println("Kolkata, West Bengal");
    }

    default void established() {
        System.out.println("Est. " + est);
    }
}

class BankOfIndia implements ReserveBank {
    String[] arr;

    BankOfIndia(String... a) {
        int o = 0;
        arr = new String[a.length];
        for (String i : a) {
            arr[o] = i;
            o++;
        }

    }

    @Override

    public void rateOfInterset() {
        System.out.println("Interest: 4.6%");
    }

    public void bankName() {
        System.out.println("Bank Of India");
    }

    public void vendors() {
        System.out.println(Arrays.toString(this.arr));
    }
}

class AxisBank implements ReserveBank {
    String[] arr;

    AxisBank(String... a) {
        arr = new String[a.length];
        int o = 0;
        for (String i : a) {
            arr[o] = i;
            o++;
        }

    }

    @Override

    public void rateOfInterset() {
        System.out.println("Interest: 4.6%");
    }

    public void bankName() {
        System.out.println("Axis Bank");
    }

    public void vendors() {
        System.out.println(Arrays.toString(arr));
    }

}

public class cwh_22_InterfaceClass {
    public static void main(String[] args) {

        // ReserveBank r= new ReserveBank(); ❌ Not allowed can't be intantiated

        BankOfIndia b = new BankOfIndia("Farmers", "BusignessGroup", "Middle Class", "NGO's");
        b.bankName();
        b.rateOfInterset();
        b.vendors();
        ReserveBank.location();
        b.established();

        System.out.println();
        System.out.println();

        AxisBank a = new AxisBank("Farmers", "Rich> 2.3L", "Middle Class", "Defense");
        a.bankName();
        a.rateOfInterset();
        a.vendors();
        ReserveBank.location();
        b.established();

    }
}
