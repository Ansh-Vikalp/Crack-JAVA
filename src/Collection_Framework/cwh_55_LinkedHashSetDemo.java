package Collection_Framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class cwh_55_LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        // Here insertion order is maintained.
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        lhs.add("five");
        lhs.add("five");
        lhs.add("five");
        lhs.add(null);

        HashSet<String> sh = new HashSet<>(Arrays.asList("six", "seven", "eleven"));

        lhs.addAll(sh);
        System.out.println("\nAlplhabets: " + lhs);

        Object oo = lhs.clone();
        System.out.println("\nCloned Alplhabets: " + oo.toString());

        lhs.remove("three");
        System.out.println("\n\nAlplhabets: " + lhs);

        lhs.retainAll(sh);
        System.out.println("\n\nRetained Alplhabets: " + lhs + "\n\n");

        System.out.println("isContains: " + lhs.contains("six"));
        System.out.println("isContains: " + lhs.contains("one"));
        System.out.println("isContainsAll: " + lhs.containsAll(sh));
        System.out.println("\n\n\n");

        Iterator<String> itr = lhs.iterator();
        int i = 0;
        while (itr.hasNext()) {
            System.out.println("E" + i + ": " + itr.next());
            itr.remove();
            i++;
        }
        System.out.println("Is Set Empty: " + lhs.isEmpty());

    }

}
