import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the limit
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = input.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series up to " + limit + ":");

        // Print Fibonacci numbers until they exceed the limit
        while (first <= limit) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        input.close();
    }
}
