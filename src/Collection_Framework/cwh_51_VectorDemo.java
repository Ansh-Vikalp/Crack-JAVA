package Collection_Framework;

import java.util.*;

public class cwh_51_VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vcc = new Vector<Integer>();
        vcc.add(1);
        vcc.add(2);
        vcc.add(3);
        vcc.add(1, 4);
        vcc.add(2, 5);
        System.out.println("\nNumbers: " + vcc);

        ArrayList<Integer> ar = new ArrayList<>(3);
        ar.add(1);
        ar.add(2);
        ar.addAll(Arrays.asList(3, 8, 9, 7));

        vcc.addAll(3, ar);
        System.out.println("\nNumbers: " + vcc);
        // Numbers: [1, 4, 5, 1, 2, 3, 8, 9, 7, 2, 3]

        System.out.println("\nIndex 0: " + vcc.get(0));
        System.out.println("Index 1: " + vcc.get(1));
        System.out.println("Index 2: " + vcc.get(2));
        System.out.println("Index 3: " + vcc.get(3));
        System.out.println("Index 4: " + vcc.get(4));

        // ? Remove by element
        vcc.remove(Integer.valueOf(4));
        vcc.add(66);
        System.out.println("\nNumbers: " + vcc);

        // Numbers: [1, 5, 1, 2, 3, 8, 9, 7, 2, 3, 66]

        // ? Remove by index
        vcc.remove(1);
        vcc.add(34);
        vcc.add(34);
        System.out.println("\nNumbers: " + vcc);

        // Numbers: [1, 1, 2, 3, 8, 9, 7, 2, 3, 66, 34, 34]
        // ? Remove All()
        vcc.removeAll(ar);
        // ar: [1, 2, 3, 8, 9, 7]
        System.out.println("\nNumbers: " + vcc);
        // Numbers: [66, 34, 34]

        vcc.addAll(1, ar);
        System.out.println("\nNumbers: " + vcc);

        // Numbers: [66, 1, 2, 3, 8, 9, 7, 34, 34]

        vcc.set(1, 67);
        vcc.set(4, 11);
        System.out.println("\nNumbers: " + vcc);

        // Numbers: [66, 67, 2, 3, 11, 9, 7, 34, 34]

        // ?RetainAll()
        vcc.add(0, 121);
        // ar: [1, 2, 3, 8, 9, 7]
        vcc.retainAll(ar);// delete all unmatching elements from list
        System.out.println("\nNumbers: " + vcc + "\n");
        vcc.addAll(ar);
        System.out.println("\nNumbers: " + vcc + "\n");

        // Numbers: [2, 3, 9, 7, 1, 2, 3, 8, 9, 7]

        // ?Getting Index of Elements
        System.out.println("Index of 9 is " + vcc.indexOf(9));
        System.out.println("Index of 3 is " + vcc.indexOf(3, 2));

        System.out.println("Last Index of 7 is " + vcc.lastIndexOf(7));
        System.out.println("Last Index of 7 is " + vcc.lastIndexOf(7, 8) + "\n");

        System.out.println("Is contain? " + vcc.contains(6));// returns false
        System.out.println("Is contain? " + vcc.contains(2));// returns true
        System.out.println("Is contain? " + vcc.containsAll(ar));// returns true
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // ? Some specialized meathods
        vcc.addElement(89);
        vcc.addElement(99);
        System.out.println("\nNumbers: " + vcc);
        System.out.println(vcc.capacity());// denotes capacity after increment when list is fulled
        System.out.println(vcc.size());

        Object uu = vcc.clone();
        Object[] ii = vcc.toArray();
        System.out.println("Cloned: " + uu.toString());
        System.out.println("Array to String: " + Arrays.toString(ii));
        System.out.println("Equals: " + uu.equals(vcc));
        System.out.println("HashCode: " + uu.hashCode());

        // Numbers: [2, 3, 9, 7, 1, 2, 3, 8, 9, 7, 89, 99]
        vcc.setElementAt(0, (vcc.size() - 1));
        System.out.println("\nFirst Element: " + vcc.firstElement());

        System.out.println("\nNumbers: " + vcc);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // *Traversing the List Elements*/

        // ? Approch-1 (Traditional for loop)
        System.out.println("----------Traditional-------");

        for (int i = 0; i < vcc.size(); i++) {
            System.out.print(vcc.get(i) + " >> ");
        }
        System.out.println("\n");

        // ? Approach-2 (Enhanced For Loop)
        // ? works only in Forward direction
        // ? Any Operation of manipulation is difficult
        System.out.println("----------For Each-------");

        for (Integer string : vcc) {
            System.out.print(string + " >> ");
        }
        System.out.println();
        System.out.println("\n");

        // ? Approach-3 (iterator interface)
        System.out.println("----------Iterator Interface-------");

        Iterator<Integer> itr = vcc.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " >> ");
        }

        // ? Approach-5 (Enumeration)
        // ? Only Works for Lagacy class - Vector, Stack, HashTable
        // ? Earlier released in Java 1.0
        // ? Works only in forward direction
        // ? Remove operation is not allowed
        // ? Not more convinent

        Enumeration<Integer> enu = vcc.elements();
        System.out.println("\n\n----------Enumerable Interface-------");

        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement() + " ");
        }
        System.out.println();

        // ? Approach-4 (List iterator interface)
        // ? works both in forward and Backward direction
        // ? also has nextIndex() & previousIndex() f/n to get index of current item
        // ? during iteration
        System.out.println();
        ListIterator<Integer> it = vcc.listIterator();
        System.out.println();

        while (it.hasNext()) {
            System.out.println(it.nextIndex());
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
            System.out.print(it.previous() + " :: ");
            it.remove();// after print it remove
        }

        System.out.println("\n\nSize(): " + vcc.size());
        System.out.println();
        vcc.clear();
        System.out.println("\nIsEmpty(): " + vcc.isEmpty());
        System.out.println("Size(): " + vcc.size());
    }
}
