// Program to demonstrate Multithreading using:
// 1. Thread Class
// 2. Runnable Interface
// Combined in one program

// Class extending Thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Class implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class MultiThreadDemo {
    public static void main(String[] args) {

        // Using Thread Class
        MyThread t1 = new MyThread();

        // Using Runnable Interface
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);

        // Starting both threads
        t1.start();
        t2.start();

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

//change file name same as  public class name like ultiThreadDemo 