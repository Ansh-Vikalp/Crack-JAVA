package Collection_Framework;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class cwh_52_StackDemo {
    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();
        stk.add("Ansh");
        stk.add(0, "Akshay");
        stk.push("Vansh");
        stk.push("Mummy");
        stk.push("Papa");
        stk.addElement("Ram");
        System.out.println("\nSTACK: " + stk);

        Vector<String> v = new Vector<>(3);
        v.addAll(Arrays.asList("Keyboard", "Mouse", "Pen", "Ansh", "Ram"));
        stk.addAll(2, v);

        System.out.println("\nSTACK: " + stk);

        System.out.println("\nIndex 2: " + stk.get(2));
        System.out.println("TOP: " + stk.peek());
        System.out.println("POP: " + stk.pop());
        System.out.println("POP: " + stk.pop());
        System.out.println("\nSTACK: " + stk);
        System.out.println("Remove: " + stk.remove(0));
        stk.remove("Mummy");
        stk.removeElement("Ansh");
        System.out.println("\nSTACK: " + stk);

        System.out.println();
        System.out.println();

        // ? Search an element
        // STACK: [Keyboard, Mouse, Pen, Ansh, Ram, Vansh]
        // 6 5 4 3 2 1
        System.out.println("Search Keyboard: " + stk.search("Keyboard"));
        System.out.println("Search Pen: " + stk.search("Pen"));
        System.out.println("Search Mummy: " + stk.search("Mummy"));
        System.out.println("containsAll:\t" + stk.containsAll(v));

        Object ob = stk.clone();
        System.out.println("Cloned :" + ob.toString());
        System.out.println("\n\n" + stk.empty());
        System.out.println(stk.capacity());
        System.out.println(stk.size());
        System.out.println();
        System.out.println();

        // *Traversing
        Enumeration<String> enu = stk.elements();

        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement() + " // ");
        }

        stk.clear();
    }
}