package Calculators;

public class HybridCalc extends ScientificCalc {

    public String binaryEquivalent(int num) {
        System.out.println("Binary: " + Integer.toBinaryString(num));
        return Integer.toBinaryString(num);
    }

    public String hexaEquivalent(int num) {
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
        return Integer.toHexString(num);
    }

    public String octalEquivalent(int num) {
        System.out.println("Octal: " + Integer.toOctalString(num));
        return Integer.toOctalString(num);
    }
}
