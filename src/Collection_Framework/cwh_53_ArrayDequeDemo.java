package Collection_Framework;

import java.util.*;

public class cwh_53_ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.addFirst("five");
        deque.addLast("six");
        System.out.println("\nDequeue: " + deque);
        // Dequeue: [five, one, two, three, four, six]
        System.out.println();

        System.out.println("Index 0: " + deque.element());
        System.out.println("Index 0: " + deque.getFirst());
        System.out.println("Index 5: " + deque.getLast());

        deque.offer("Last");
        deque.offerLast("Second Last");
        deque.offerFirst("head");
        System.out.println("\nDequeue: " + deque);

        // ? Peek
        System.out.println("\n\nRetrive head: " + deque.peek());
        System.out.println("Retrive head: " + deque.peekFirst());
        System.out.println("Retrive tail: " + deque.peekLast());
        System.out.println();

        // ? Poll
        System.out.println("Retrive & Remove Head: " + deque.poll());
        System.out.println("Deque: " + deque);
        System.out.println("Retrive & Remove Head: " + deque.pollFirst());
        System.out.println("Deque: " + deque);
        System.out.println("Retrive & Remove Tail: " + deque.pollLast());
        System.out.println("Deque: " + deque);

        // ? Push
        deque.push("Ghar");
        deque.push("Hammer");
        deque.push("Hammer");
        deque.pop();
        System.out.println("\n\n\nDeque: " + deque);

        // ? set
        System.out.println("Deque size: " + deque.size());

        // ? remove
        deque.remove();
        deque.removeFirst();
        deque.removeLast();
        System.out.println("\n\nDeque: " + deque);

    }
}
