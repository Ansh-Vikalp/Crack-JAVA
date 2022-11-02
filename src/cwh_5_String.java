public class cwh_5_String {
    public static void main(String[] args) {
        // 📌 Strings in JAVA
        /*
         * String is an Immutable class in java.In java string is treated as an object
         * There are two ways to create a string:-
         * 1) By String Literal(space allocated in String Constant Pool)
         * 2) By use of new keword(Space allocated in Heap)
         */

        // By use of literals
        String s = "Ansh";
        System.out.println(s);

        // By use of new
        String str = new String("Vikalp");
        System.out.println(str);

        // Diffrent ways to print in Java

        int a = 9;
        float b = 29.8845f;

        System.out.println("Println");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("Print");
        System.out.print("a=" + a + " ");
        System.out.println("b=" + b);

        System.out.println("Printf");
        System.out.printf("a=%d b=%f\n", a, b);

        System.out.println("format");
        System.out.format("a=%d b=%8.2f", a, b);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // String Meathods
        s = "Anshnshshnsh";
        System.out.println("-----------------toLowerCase() & toUpperCase()------------------------------");
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println();

        System.out.println("-----------------------------------length()-----------------------------------");

        int length = s.length();
        System.out.println(length);
        System.out.println();

        System.out.println("-----------------------------------trim()-----------------------------------");

        String oo = "   Vansh         ";
        System.out.println(oo);
        System.out.println(oo.trim());
        System.out.println();

        System.out.println("-----------------------------------replace()-----------------------------------");

        String yy = s.replace('s', 'w');
        System.out.println(yy);
        String gg = yy.replace("wh", "p");
        System.out.println(gg);
        System.out.println();

        System.out.println("-----------------------------------substring()-----------------------------------");

        String sub1 = gg.substring(3);
        String sub2 = gg.substring(1, 5);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println();

        System.out.println("-----------------------------------IndexOf()-----------------------------------");
        // Here gg= Anpnppnp
        System.out.println(gg.indexOf('p'));// 2
        System.out.println(gg.indexOf("np"));// 1
        System.out.println(gg.indexOf('p', 3));// 4
        System.out.println(gg.indexOf("np", 4));// 6
        System.out.println(gg.indexOf("o", 3));// -1
        System.out.println(gg.lastIndexOf('n'));// 6
        System.out.println(gg.lastIndexOf("np"));// 6
        System.out.println(gg.lastIndexOf('p', 6));// 5
        System.out.println(gg.lastIndexOf("np", 5));// 3
        System.out.println();

        System.out.println("-------------------------startsWith() & endsWith()-----------------------");

        System.out.println(gg.startsWith("A"));
        System.out.println(gg.startsWith("o"));
        System.out.println();

        System.out.println("------------------------equals() & equalsIgnoreCase()----------------------");

        System.out.println(gg.equals("anpnppnp"));
        System.out.println(gg.equalsIgnoreCase("anpnppnp"));

    }
}
