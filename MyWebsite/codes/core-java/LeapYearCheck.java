import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = false;

        // Leap year logic:
        // 1. Year is divisible by 4
        // 2. Year is not divisible by 100 unless it is divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        // Output result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }
}
