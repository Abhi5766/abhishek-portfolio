// Simple Java Program for:
// HashSet, LinkedHashSet, TreeSet

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        // HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");

        System.out.println("HashSet:");
        for (String s : hs) {
            System.out.println(s);
        }

        // LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Mango");

        System.out.println("\nLinkedHashSet:");
        for (String s : lhs) {
            System.out.println(s);
        }

        // TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Mango");

        System.out.println("\nTreeSet:");
        for (String s : ts) {
            System.out.println(s);
        }
    }
}