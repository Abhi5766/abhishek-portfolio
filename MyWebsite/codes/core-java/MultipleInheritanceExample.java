// First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// Class implementing both interfaces
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing from Printable interface");
    }

    public void show() {
        System.out.println("Showing from Showable interface");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
