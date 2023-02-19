package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class cwh_58_LinkedHashMapDemo {
    public static void main(String[] args) {
        // ! ✍Note The Linked map maintains insertion order as first key 4 inserted
        // ! also, in o/p key 4 is shown

        LinkedHashMap<Integer, String> linkhm = new LinkedHashMap<Integer, String>(4);
        linkhm.put(4, "Grape");
        linkhm.put(3, "Banana");
        linkhm.put(2, "Apple");
        linkhm.put(1, "Mango");

        System.out.println("\nFruits: " + linkhm.entrySet());
        linkhm.put(3, "Pear");// it replaces the old value for Key: 3
        System.out.println("\nKey-3 relacement: " + linkhm.entrySet());
        linkhm.put(5, null);
        linkhm.put(null, "WaterMelon");
        linkhm.put(null, null);

        System.out.println("\nFruits: " + linkhm.entrySet());

        LinkedHashMap<Integer, String> hashm = new LinkedHashMap<>();
        hashm.put(6, "Mango");
        hashm.put(7, "Apple");
        hashm.put(8, "Banana");
        linkhm.putAll(hashm);
        // ? values can be duplicate in an hash Map
        System.out.println("\nFruits: " + linkhm.entrySet());

        // ? Set of Keys
        System.out.println("\nKeys Fruits: " + linkhm.keySet());

        // ? Set Of Values
        System.out.println("\nValues Fruits: " + linkhm.values());

        // ? Removing entry
        linkhm.remove(1);
        linkhm.remove(2, "Apple");
        System.out.println("\nFruits: " + linkhm.entrySet());

        // ? Relacing value
        linkhm.replace(null, "Infinity");
        linkhm.replace(8, "Banana", "Apricot");
        System.out.println("\nFruits: " + linkhm.entrySet());

        // ? Contains
        System.out.println();
        System.out.println(linkhm.containsKey(9));
        System.out.println(linkhm.containsValue("Apple"));

        // ? Iterating
        System.out.println();
        for (Map.Entry<Integer, String> e : linkhm.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        linkhm.clear();
        System.out.println("\nisEmpty: " + linkhm.isEmpty());
        System.out.println("Size: " + linkhm.size());

    }
}
