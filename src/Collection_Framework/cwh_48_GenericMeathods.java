package Collection_Framework;

class NoiseMaker {

    private int data;

    // *We can write a single generic method declaration that can be called with
    // * arguments of different types

    /*
     * Generic methods are methods that introduce their own type parameters.
     * 
     * This is similar to declaring a generic type, but the type parameter's scope
     * is limited to the method where it is declared.
     * You can create static and non-static generic methods and generic
     * constructors.
     * If we define generic class then it's scope is within all member of its class
     * However if define generic meathod(Either static or non-static)/constructor/
     * then it's scope is bounded till f/n() boundry.
     */
    // head is generic while k is integer
    public <T> void setName(T head, int k) {
        this.data = k;
        T temp = head;
        System.out.println("Generic temp= " + temp + "\tNon-Generic data= " + data);

    }
}

public class cwh_48_GenericMeathods {
    public static void main(String[] args) {

        NoiseMaker python = new NoiseMaker();
        python.setName("Ansh Vikalp", 9);
        python.setName(8, 9);
        python.setName('G', 9);
        python.setName(true, 9);
        python.setName(67.57, 9);

    }
}
