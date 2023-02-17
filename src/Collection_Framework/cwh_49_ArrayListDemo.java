package Collection_Framework;

import java.util.*;

public class cwh_49_ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add(0, "Grapes");
        list.add("Watermelon");
        list.add(2, "Guava");

        System.out.println("\nFruits List: " + list);

        ArrayList<String> list2 = new ArrayList<>(4);
        list2.add("Apple");
        list2.add("Orange");
        list2.add("Cherry");
        list2.addAll(0, Arrays.asList("Banana", "DragonFruit"));

        list.addAll(list2);

        System.out.println("\nFruits List: " + list);

        System.out.println("\nIndex 0: " + list.get(0));
        System.out.println("Index 1: " + list.get(1));
        System.out.println("Index 2: " + list.get(2));
        System.out.println("Index 3: " + list.get(3));
        System.out.println("Index 4: " + list.get(4));
        // System.out.println("Index 5: "+ list[5]);❌

        // ! list.add(13, "Mausami"); IndexOutOfBoundException
        // ! list.get(13); IndexOutOfBoundException

        // [Grapes, Apple, Guava, Banana, Watermelon, Banana, DragonFruit, Apple,
        // Orange, Cherry]

        System.out.println("\nSize " + list.size());
        list.set(2, "BlackBerry");
        list.set(0, "Wildgrapes");

        System.out.println("\nFruits List: " + list);

        // [WildGrapes, Apple, BlackBerry, Banana, Watermelon, Banana, DragonFruit,
        // Apple,
        // Orange, Cherry]

        // ?Remove by element
        list.remove("Orange");
        list.add("Apple");
        System.out.println("\nFruits List: " + list);

        // ?Remove by Index
        list.remove(1);
        System.out.println("\nFruits List: " + list);

        // ? RemoveAll()
        // *list2: [Banana, DragonFruit, Apple, Orange, Cherry] */
        list.removeAll(list2);// *common value also get removed*/
        System.out.println("\nFruits List: " + list);

        list.addAll(1, list2);
        System.out.println("\nFruits List: " + list);

        // ?RetainAll()
        list.add(0, "Apple");
        list.retainAll(list2);// delete all unmatching elements from list
        System.out.println("\nFruits List: " + list + "\n");

        // ?Getting Index of Elements
        System.out.println("Index of \"Banana\" " + list.indexOf("Banana"));
        System.out.println("Last Index of \"Apple\" " + list.lastIndexOf("Apple") + "\n");

        System.out.println("Is contain? " + list.contains("dragonfruit"));// returns false as it is case sensitive
        System.out.println("Is contain? " + list.contains("DragonFruit"));// returns true
        System.out.println("Is contain? " + list.containsAll(list2));// returns true
        System.out.println();

        Object[] arr = list.toArray();

        for (Object object : arr) {
            System.out.print((String) object + "::");
        }

        System.out.println("\n\nHashcode: " + list.hashCode());

        System.out.println();

        Object duplicate = list2.clone();// We can not use list.clone() as it's refence is List Type and clone is only
                                         // defined in arrayList class
        System.out.println(duplicate);

        List<String> sub = list.subList(0, 3);// goes to 2 index only
        System.out.println("\nSublist: " + sub);
        System.out.println();

        // *Traversing the List Elements*/
        // ? Approch-1 (Traditional for loop)
        System.out.println("----------Traditional-------");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(list.get(i) + " >> ");
        }
        System.out.println("\n");

        // ? Approach-2 (Enhanced For Loop)
        // ? works only in Forward direction
        // ? Any Operation of manipulation is difficult
        System.out.println("----------For Each-------");

        for (String string : list) {
            System.out.print(string + " >> ");
        }
        System.out.println();
        System.out.println("\n");

        // ? Approach-3 (iterator interface)
        System.out.println("----------Iterator Interface-------");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " >> ");
        }

        // ? Approach-4 (List iterator interface)
        // ? works both in forward and Backward direction
        // ? also has nextIndex() & previousIndex() f/n to get index of current item
        // ? during iteration
        System.out.println();
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            it.next();
        }

        /**
         ** Goes in infinite loop and below statement never executed
         ** while (it.hasNext()) {
         ** 
         ** }
         * 
         ** while (it.hasPrevious()) {
         ** 
         ** }
         * 
         * ! Exception in thread "main" java.util.NoSuchElementException
         ** while (it.hasNext()) {
         ** it.previous();
         ** }
         * ! Exception in thread "main" java.util.NoSuchElementException
         ** while (it.hasPrevious()) {
         ** System.out.print(it.next() + " << ");
         ** }
         * 
         * 
         */
        System.out.println();

        System.out.println("\n----------List Iterator Interface--------");
        while (it.hasPrevious()) {
            System.out.print("Index " + it.previousIndex() + "- " + it.previous() + " :: ");
        }
        System.out.println();
        list.clear();
        System.out.println("\nIsEmpty(): " + list.isEmpty());
        System.out.println("Size(): " + list.size());

    }
}
