package Collection_Framework;
// The declaration of a generic class is almost the same as that of a non-generic class except the class name is followed by a type parameter section.

class ABC<T> {
    T object;

    public ABC(T ob) {
        this.object = ob;

    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class cwh_47_Generics {
    public static void main(String[] args) {

        // Generic Type argument
        // *In Java SE 7 and later, you can replace the type arguments required too/
        // * invoke the constructor of a generic class with an empty set of type
        // *arguments (<>). */
        ABC<Integer> o1 = new ABC<>(99);
        // ?OR, ABC<Integer> obh= new ABC<Integer>(88); ✅
        System.out.println(o1.getClass());
        System.out.println("Hashcode,, " + o1);
        System.out.println(o1.getObject() + "\n\n");

        // *! List, Queue, Set interface are one argument generic and has same syntax as
        // ! class ABC<T> {//some code}

        ABC<String> o2 = new ABC<>("ChanchorDasChanchas");
        System.out.println(o2.getClass());
        System.out.println("Hashcode,, " + o2.hashCode());
        System.out.println(o2.getObject() + "\n\n");

        // ! Maps interface are two argument generic and has same syntax as
        // ! class Pair<Key, Value> {//some code} such types are class made when we
        // ! require to store our value in form of (distint Key==> Value)
        // ! Note this is not limited and yu can create your own any no. generic type
        // parametr interface and declare public abstract void name();
        Pair<Integer, String> obb = new Pair<>(1, "LileshPathe");
        Pair<Integer, String> obb2 = new Pair<>(2, "RamBabu");
        Pair<Integer, String> obb3 = new Pair<>(3, "GoravNayak");
        Pair<Integer, String> obb4 = new Pair<>(4, "PraveenSharma");
        System.out.println(obb.getKey() + " ==> " + obb.getValue());
        System.out.println(obb2.getKey() + " ==> " + obb2.getValue());
        System.out.println(obb3.getKey() + " ==> " + obb3.getValue());
        System.out.println(obb4.getKey() + " ==> " + obb4.getValue());
        /*
         * Fire cmd- javap -p classpath;
         * EX- javap -p java.lang.Object
         * Shows all the meathods AND feilds of that concerned class.
         * ctrl + ~ := Toggle terminal (Windows)
         */

        /*
         * Type parameter Naming Conventions
         * 
         * By convention, type parameter names are single, uppercase letters.
         * 
         * The most commonly used type parameter names are:
         * 
         * E - Element (used extensively by the Java Collections Framework)
         * 
         * K - Key
         * 
         * N/V - Number
         * 
         * T - Type
         * 
         * 
         */
    }
}
