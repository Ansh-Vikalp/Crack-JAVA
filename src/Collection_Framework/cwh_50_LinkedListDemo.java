package Collection_Framework;

import java.util.*;

public class cwh_50_LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add(2, "five");
        list.add(3, "six");
        System.out.println("\nNumbers: " + list);

        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("balti", "Books", "mouse"));
        list.addAll(1, list2);
        System.out.println("\nNumbers: " + list);

        System.out.println("\nIndex 0: " + list.get(0));
        System.out.println("Index 1: " + list.get(1));
        System.out.println("Index 2: " + list.get(2));
        System.out.println("Index 3: " + list.get(3));
        System.out.println("Index 4: " + list.get(4));
        // System.out.println("Index 5: "+ list[5]);❌

        // ! list.add(13, "Mausami"); IndexOutOfBoundException
        // ! list.get(13); IndexOutOfBoundException

        // Numbers: [one, balti, Books, mouse, two, five, six, three, four]
        // ? Remove by element
        list.remove("three");
        list.add("one");
        System.out.println("\nNumbers: " + list);

        // Numbers: [one, balti, Books, mouse, two, five, six, four, one]

        // ? Remove by index
        list.remove(1);
        list.add("balti");
        list.add("balti");
        System.out.println("\nNumbers: " + list);

        // Numbers: [one, Books, mouse, two, five, six, four, one, balti, balti]
        // ? Remove All()
        list.removeAll(list2);
        System.out.println("\nNumbers: " + list);

        list.addAll(1, list2);
        System.out.println("\nNumbers: " + list);

        // Numbers: [one, balti, Books, mouse, two, five, six, four, one]

        list.set(1, "Mobile");
        list.set(4, "Towel");
        System.out.println("\nNumbers: " + list);

        // Numbers: [one, Mobile, Books, mouse, Towel, five, six, four, one]

        // ?RetainAll()
        list.add(0, "Apple");
        // list2: [balti, Books, mouse]
        list.retainAll(list2);// delete all unmatching elements from list
        System.out.println("\nNumbers: " + list + "\n");
        list.addAll(list2);
        System.out.println("\nNumbers: " + list + "\n");

        // Numbers: Numbers: [Books, mouse, balti, Books, mouse]

        // ?Getting Index of Elements
        System.out.println("Index of \"Books\" " + list.indexOf("Books"));
        System.out.println("Last Index of \"one\" " + list.lastIndexOf("one") + "\n");

        System.out.println("Is contain? " + list.contains("books"));// returns false as it is case sensitive
        System.out.println("Is contain? " + list.contains("Books"));// returns true
        System.out.println("Is contain? " + list.containsAll(list2));// returns true
        System.out.println();

        // ? Some specialized meathods

        list.addFirst("One");
        list.addLast("Twelve");
        System.out.println("\nNumbers: " + list);

        System.out.println(list.getClass() + " getFirst(): " + list.getFirst());
        System.out.println(list.getClass() + " getLast(): " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("\nNumbers: " + list);

        list.offer("last");
        list.offerFirst("first");
        list.offerLast("secondlast");
        System.out.println("\nNumbers: " + list);

        System.out.println("\n\nRetrive head: " + list.peek());
        System.out.println("Retrive head: " + list.peekFirst());
        System.out.println("Retrive tail: " + list.peekLast());
        System.out.println();

        System.out.println("Retrive & Remove Head: " + list.poll());
        System.out.println("Numbers: " + list);
        System.out.println("Retrive & Remove Head: " + list.pollFirst());
        System.out.println("Numbers: " + list);
        System.out.println("Retrive & Remove Tail: " + list.pollLast());
        System.out.println("Numbers: " + list);

        Object[] ob = list.toArray();
        System.out.println("\nNumbers: " + Arrays.toString(ob));
        System.out.println();
        List<String> sub3 = list.subList(1, 3);
        System.out.println("SubList: " + sub3);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // *Traversing the List Elements*/
        // ? Approch-1 (Traditional for loop)
        System.out.println("----------Traditional-------");

        for (int i = 0; i < list.size(); i++) {
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
            System.out.print("Index " + it.previousIndex() + "- " + it.previous() + " :: ");
            it.remove();// after print it remove
        }
        System.out.println("\nSize(): " + list.size());
        System.out.println();
        list.clear();
        System.out.println("\nIsEmpty(): " + list.isEmpty());
        System.out.println("Size(): " + list.size());
    }
}
