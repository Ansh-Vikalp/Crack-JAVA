public class cwh_2_ConversionDataTypes {
    public static void main(String[] args) {

        // Resulting data Type after arithmetic operation
        byte b = 9;
        byte u = 8;
        short s = 87;
        int i = 2, ii;
        float f = 56.66f, ff;
        double d = 66.77, dd;
        long l = 4000000000000L, ll;
        char c = 'A';
        // no ramdom
        // Type Promotion(auto allowed) SEE NOTES
        int hd = b + s;
        int oo = b + u;
        int jg = i + s;
        long lm = l + i;
        float kk = f + s;
        double rr = f + d;
        float yy = l + f;
        int cg = c + i;// int+ char or char+ char= int if we want a char then typeconversion
                       // Explicitely to (char)
        System.out.println(hd + " " + oo + " " + jg + " " + lm + " " + kk + " " + rr + " " + yy + " " + cg);

        // Implicit conversion(auto)
        // Byte--> Short--> Int--> long--> Float--> Double (small to high)

        ii = b;
        ff = l;
        ll = s;
        dd = ll;
        System.out.println(ii + " " + ff + " " + ll + " " + dd);
        // bb=d; Not allowed

        // Explicit Conversion(user)
        // Double--> Float--> Long--> Int--> Short--> Byte (high to small)

        b = (byte) i;
        s = (short) i;
        l = (long) f;
        f = (float) d;
        l = (long) d;

        c = 66;// allowed
        c += 1;

        System.out.println(c);

    }
}
