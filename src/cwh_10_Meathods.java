import java.util.Arrays;

public class cwh_10_Meathods {
    public static int logic(int x, int y) {
        int d = 0;

        if (x > y) {
            d = (x - y) * x;
        } else {
            d = (x + y) * y;
        }
        return d;

    }

    void greeting() {
        System.out.println("Hellow,Ansh have a nice dAY!");
    }

    static void change(int[] x) {
        x[0] = 33;

    }

    public static void main(String[] args) {
        // Meathods in JAVA
        // These are used to avoid repetation
        // int a = 2;
        // int b = 4;
        // int c = 0;
        // if (b > a) {
        // c = (a + b) * b;
        // } else {
        // c = (a - b) * b;
        // }

        // int a1 = 6;
        // int b1 = 2;
        // int c1 = 0;
        // if (b1 > a1) {
        // c1 = (a1 + b1) * b1;
        // } else {
        // c1 = (a1 - b1) * b1;
        // }

        // here logic() is static so we can call it directly
        int u = 9;
        int f = 5;
        int ans = logic(u, f);
        System.out.println("Logic returns: " + ans);
        System.out.println("Logic returns: " + cwh_10_Meathods.logic(3, 6));// copy of value get passed
        System.out.println("Logic returns: " + logic(0, 0));

        // here gretting() is instateneous meathod so we call it with obj.reference.
        cwh_10_Meathods obj = new cwh_10_Meathods();
        obj.greeting();

        System.out.println();
        System.out.println();

        int[] kk = { 1, 2, 3, 4 };
        System.out.println("Old Array: " + Arrays.toString(kk));
        change(kk);// here as we passing reference of mem where obj created so it changes value in
                   // original
        System.out.println("New Array: " + Arrays.toString(kk));

    }
}
