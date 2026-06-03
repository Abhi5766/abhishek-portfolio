// Simple Java Program to demonstrate Iterator

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");

        // Create Iterator
        Iterator<String> itr = list.iterator();

        // Access elements using Iterator
        System.out.println("Collection Elements:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}