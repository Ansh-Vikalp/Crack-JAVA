package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class cwh_57_HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>(4);
        hm.put(4, "Grape");
        hm.put(3, "Banana");
        hm.put(2, "Apple");
        hm.put(1, "Mango");
        // ! ✍Note The map not maintains insertion order as first key 4 inserted but in
        // ! o/p key 1 is shown
        System.out.println("\nFruits: " + hm.entrySet());
        hm.put(3, "Pear");// it replaces the old value for Key: 3
        System.out.println("\nKey-3 relacement: " + hm.entrySet());
        hm.put(5, null);
        hm.put(null, "WaterMelon");
        hm.put(null, null);

        System.out.println("\nFruits: " + hm.entrySet());

        HashMap<Integer, String> hashm = new HashMap<>();
        hashm.put(6, "Mango");
        hashm.put(7, "Apple");
        hashm.put(8, "Banana");
        hm.putAll(hashm);
        // ? values can be duplicate in an hash Map
        System.out.println("\nFruits: " + hm.entrySet());

        // ? Set of Keys
        System.out.println("\nKeys Fruits: " + hm.keySet());

        // ? Set Of Values
        System.out.println("\nValues Fruits: " + hm.values());

        // ? Removing entry
        hm.remove(1);
        hm.remove(2, "Apple");
        System.out.println("\nFruits: " + hm.entrySet());

        // ? Relacing value
        hm.replace(null, "Infinity");
        hm.replace(8, "Banana", "Apricot");
        System.out.println("\nFruits: " + hm.entrySet());

        // ? Contains
        System.out.println();
        System.out.println(hm.containsKey(9));
        System.out.println(hm.containsValue("Apple"));

        // ? Iterating
        System.out.println();
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        hm.clear();
        System.out.println("\nisEmpty: " + hm.isEmpty());
        System.out.println("Size: " + hm.size());

    }
}
