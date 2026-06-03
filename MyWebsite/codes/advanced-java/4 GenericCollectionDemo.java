// Simple Java Program for:
// Generic Class, Generic Method,
// ArrayList, Vector, LinkedList

import java.util.*;

// Generic Class
class Test<T> {
    T data;

    Test(T data) {
        this.data = data;
    }

    void show() {
        System.out.println("Generic Class Data: " + data);
    }
}

public class GenericCollectionDemo {

    // Generic Method
    static <T> void display(T value) {
        System.out.println("Generic Method Data: " + value);
    }

    public static void main(String[] args) {

        // Generic Class
        Test<Integer> obj1 = new Test<>(10);
        Test<String> obj2 = new Test<>("Java");

        obj1.show();
        obj2.show();

        // Generic Method
        display(100);
        display("Hello");

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("\nArrayList:");
        for (String s : list) {
            System.out.println(s);
        }

        // Vector
        Vector<String> v = new Vector<>();
        v.add("Red");
        v.add("Blue");

        System.out.println("\nVector:");
        for (String s : v) {
            System.out.println(s);
        }

        // LinkedList
        LinkedList<String> l = new LinkedList<>();
        l.add("Java");
        l.add("Python");

        System.out.println("\nLinkedList:");
        for (String s : l) {
            System.out.println(s);
        }
    }
}