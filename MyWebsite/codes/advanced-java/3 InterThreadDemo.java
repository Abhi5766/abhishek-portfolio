// Simple Java Program for Inter-thread Communication
// Demonstrates wait(), notify(), notifyAll()

class Customer {

    // Method with wait()
    synchronized void waitMethod() {
        System.out.println("Thread is waiting...");
        try {
            wait(); // waits until notified
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread resumed.");
    }

    // Method with notify() and notifyAll()
    synchronized void notifyMethod() {
        System.out.println("Thread is notifying...");
        notify();      // wakes one thread
        notifyAll();   // wakes all threads
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {

        Customer c = new Customer();

        // Thread 1
        new Thread() {
            public void run() {
                c.waitMethod();
            }
        }.start();

        // Thread 2
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                c.notifyMethod();
            }
        }.start();
    }
}
