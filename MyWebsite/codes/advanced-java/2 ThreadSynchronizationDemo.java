// Program to demonstrate Thread Synchronization in Java

// Shared resource class
class Table {
    
    // synchronized method ensures only one thread can access at a time
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            
            try {
                Thread.sleep(500); // Pause for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// First thread
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

// Second thread
class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

// Main class
public class ThreadSynchronizationDemo {
    public static void main(String[] args) {
        
        Table obj = new Table(); // Shared object
        
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        // Start threads
        t1.start();
        t2.start();
    }
}