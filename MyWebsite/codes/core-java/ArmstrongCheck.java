import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of number of digits
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}
