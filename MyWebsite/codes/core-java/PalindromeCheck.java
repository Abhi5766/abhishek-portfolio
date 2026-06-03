import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // Check if original and reversed are the same
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome number.");
        }

        input.close();
    }
}
