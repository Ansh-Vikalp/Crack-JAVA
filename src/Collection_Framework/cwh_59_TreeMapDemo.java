package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class cwh_59_TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treemp = new TreeMap<>();
        // ? It uses self-balancing red- black tree to store entries(Key-Value);
        // ? In asending order
        treemp.put(4, "four");
        treemp.put(3, "three");
        treemp.put(1, "one");
        treemp.put(2, "two");

        System.out.println("\nNumbers: " + treemp.entrySet());
        treemp.put(3, "Nine Frog");// it replaces the old value for Key: 3
        System.out.println("\nKey-3 relacement: " + treemp.entrySet());
        /*
         * Null Key or Value is not allowed in TreeMap
         * treemp.put(5, null);
         * treemp.put(null, "Empty");
         * treemp.put(null, null);
         */

        LinkedHashMap<Integer, String> hashm = new LinkedHashMap<>();
        hashm.put(6, "Six");
        hashm.put(8, "Eight");
        hashm.put(7, "Seven");
        treemp.putAll(hashm);
        // ? values can be duplicate in an hash Map
        System.out.println("\nNumbers: " + treemp.entrySet());

        // ? Set of Keys
        System.out.println("\nKeys Numbers: " + treemp.keySet());

        // ? Set Of Values
        System.out.println("\nValues Numbers: " + treemp.values());

        // ? Removing entry
        treemp.remove(1);
        treemp.remove(2, "two");
        System.out.println("\nNumbers: " + treemp.entrySet());

        // ? Relacing value
        treemp.replace(6, "Sixty6");
        treemp.replace(8, "Eight", "Eighty8");
        System.out.println("\nNumbers: " + treemp.entrySet());

        // ? Contains
        System.out.println();
        System.out.println(treemp.containsKey(9));
        System.out.println(treemp.containsValue("four"));

        // ? Iterating
        System.out.println();
        for (Map.Entry<Integer, String> e : treemp.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // ? Specialized Meathods
        // *Returns the least key strictly greater than the given key, or null if there
        // *is no such key. */
        System.out.println("highestKey: " + treemp.higherKey(5));
        System.out.println();

        // *Returns a key-value mapping associated with the least key strictly greater
        // * than the given key */
        System.out.println("highestEntry: " + treemp.higherEntry(5));
        System.out.println();

        /*
         * Returns the first (lowest) key currently in this map.
         */
        System.out.println("firstKey: " + treemp.firstKey());
        System.out.println();

        /*
         * Returns a key-value mapping associated with the least key in this map, or
         * null if the map is empty.
         */

        System.out.println("firstEntry: " + treemp.firstEntry());
        System.out.println();

        /*
         * Returns the last (highest) key currently in this map.
         */
        System.out.println("lastKey: " + treemp.lastKey());
        System.out.println();

        /*
         * Returns a key-value mapping associated with the highest key in this map, or
         * null if the map is empty.
         */

        System.out.println("lastEntry: " + treemp.lastEntry());
        System.out.println();

        /*
         * Removes and returns a key-value mapping associated with the least key in this
         * map, or null if the map is empty.
         */

        System.out.println("pollFirstEntry: " + treemp.pollFirstEntry());
        System.out.println();

        /*
         * Removes and returns a key-value mapping associated with the highest key in
         * this
         * map, or null if the map is empty.
         */

        System.out.println("pollLastEntry: " + treemp.pollLastEntry());
        System.out.println();

        System.out.println("Modified Numbers: " + treemp.entrySet());

        treemp.clear();
        System.out.println("\n\nisEmpty: " + treemp.isEmpty());
        System.out.println("TreeMap Size: " + treemp.size());

    }
}
