package Collection_Framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class cwh_54_HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(4);
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("C");
        hs.add("D");
        hs.add(null);
        hs.add(null);
        // hs.add(2,"C");❌ Not Allowed
        // hs.get(3); ❌ Not allowed
        HashSet<String> sh = new HashSet<>(Arrays.asList("D", "E", "F", "F", "F"));

        hs.addAll(sh);
        System.out.println("\nAlplhabets: " + hs);

        Object oo = hs.clone();
        System.out.println("\nAlplhabets: " + oo.toString());

        hs.remove("C");
        System.out.println("\n\nAlplhabets: " + hs);

        hs.retainAll(sh);
        System.out.println("\n\nAlplhabets: " + hs);

        System.out.println("isContains: " + hs.contains("D"));
        System.out.println("isContains: " + hs.contains("A"));
        System.out.println("isContainsAll: " + hs.containsAll(sh));
        System.out.println("\n\n\n");

        Iterator<String> itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println("E: " + itr.next());
            itr.remove();
        }
        System.out.println("Is Set Empty: " + hs.isEmpty());

    }

}
