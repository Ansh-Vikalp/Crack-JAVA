package Calculators;

public class ScientificCalc extends SimpleCalc {

    public void sine(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Sine" + a + "\u00B0 = " + Math.sin(rad));
    }

    public void cosine(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Cos" + a + "\u00B0 = " + Math.cos(rad));
    }

    public void tan(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Tan" + a + "\u00B0 = " + Math.tan(rad));
    }

    public void sineh(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Sinh" + a + "\u00B0 = " + Math.sinh(rad));
    }

    public void cosh(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Cosh" + a + "\u00B0 = " + Math.cosh(rad));
    }

    public void cot(double a) {
        double rad = Math.toRadians(a);
        System.out.println("Tanh" + a + "\u00B0 = " + Math.tanh(rad));
    }

}
