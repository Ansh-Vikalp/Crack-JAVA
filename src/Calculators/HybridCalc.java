package Calculators;

public class HybridCalc extends ScientificCalc {

    public void binaryEquivalent(int num) {
        System.out.println("Binary: " + Integer.toBinaryString(num));
    }

    public void hexaEquivalent(int num) {
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }

    public void octalEquivalent(int num) {
        System.out.println("Octal: " + Integer.toOctalString(num));
    }
}
