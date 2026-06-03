import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get range from the user
        System.out.print("Enter the starting number of the range: ");
        int start = input.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

        input.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
