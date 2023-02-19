package Collection_Framework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student {
    int roll;
    String name;
    String[] sub;
    String sem;

    public Student(int roll, String name, String sem, String[] sub) {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.sem = sem;
    }

    public void getData() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("Sem: " + this.sem);
        System.out.println("Sub: " + Arrays.toString(this.sub));
    }

}

public class cwh_56_TreeSetDemo implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);// --> sort in increasing order
        // return s2.name.compareTo(s1.name); --> s2-s1 sort in decreasing order

    }

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>(new cwh_56_TreeSetDemo());
        treeSet.add(new Student(1, "Ansh Vikalp", "V", new String[] { "Physics", "Math", "SST" }));
        treeSet.add(new Student(2, "Vansh Utsav", "VI", new String[] { "Physics", "Math", "SST", "Chemistry" }));
        treeSet.add(new Student(7, "Hariom Mishra", "VI", new String[] { "Networking", "Compiler Design", "Ml" }));

        // treeSet.add(null); ❌ java.lang.NullPointerException Treeset does not allows
        // null value
        System.out.println("\n\n--------------Comparator treeSet------------------- ");
        for (Student student : treeSet) {
            student.getData();
            System.out.println();
        }
        System.out.println();
        System.out.println();

        TreeSet<Student> treeSet2 = new TreeSet<Student>(new cwh_56_TreeSetDemo());

        treeSet2.addAll(Arrays.asList(
                new Student(4, "Aman Jain", "VI", new String[] { "Networking", "Compiler Design", "Ml", "Python" }),
                new Student(5, "Anshika Gupta", "VI", new String[] { "Networking", "Compiler Design", "Ml", "Java" })));
        treeSet.addAll(treeSet2);
        System.out.println("\n\n----------------TreeSet------------------- ");
        for (Student student : treeSet) {
            student.getData();
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // *Returns the least element in this set greater than or equal to the given
        // *element, or null if there is no such element. */
        // * Here based on name as we have used Comparator soted tree on name feild */
        System.out.println("-------------Celiling--------------- ");
        treeSet.ceiling(new Student(6, "Baradox", "V", new String[] { "Physics", "Math", "SST" })).getData();
        System.out.println();

        // Here comparision is based on name only it does not check any other feild
        System.out.println("is Contains? " + treeSet.contains(
                new Student(77, "Anshika Gupta", "VI",
                        new String[] { "Networking", "Compiler Design", "Ml", "Java" })));
        System.out.println();

        /*
         * 
         * Returns the greatest element in this set less than or equal to the given
         * element, or null if there is no such element
         */

        System.out.println("-------------Floor--------------- ");
        treeSet.floor(new Student(6, "Baradox", "V", new String[] { "Physics", "Math", "SST" })).getData();
        System.out.println();

        // * Retrives the Lowest Element from this set
        System.out.println("-------------First--------------- ");
        treeSet.first().getData();
        System.out.println();

        // * Retrives the Highest Element from this set
        System.out.println("-------------Last--------------- ");
        treeSet.last().getData();
        System.out.println();

        // * Retrives & Removes the Lowest Element from this set
        System.out.println("-------------Poll First--------------- ");
        treeSet.pollFirst().getData();
        System.out.println();

        // * Retrives & Removes the Highest Element from this set
        System.out.println("-------------Poll Last--------------- ");
        treeSet.pollLast().getData();
        System.out.println();

        System.out.println("^^^^^^^^^^^^^^^^^^Iterating the Set^^^^^^^^^^^^^^^^^^^^");
        Iterator<Student> itr = treeSet.iterator();

        while (itr.hasNext()) {
            itr.next().getData();
            System.out.println("\n");
        }

    }

}
