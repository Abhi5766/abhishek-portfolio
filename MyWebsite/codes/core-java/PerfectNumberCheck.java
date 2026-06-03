import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // Find all divisors and add them (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors equals the number
        if (sum == number && number != 0) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }

        input.close();
    }
}
