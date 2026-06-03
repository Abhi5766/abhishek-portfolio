import java.util.Scanner;

public class AbsentDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        // Array to track digits presence; initialized to false
        boolean[] digitsPresent = new boolean[10];

        // Mark digits that appear in the number
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                digitsPresent[ch - '0'] = true;
            }
        }

        System.out.print("Digits absent in the given number: ");
        boolean anyAbsent = false;
        for (int i = 0; i <= 9; i++) {
            if (!digitsPresent[i]) {
                System.out.print(i + " ");
                anyAbsent = true;
            }
        }

        if (!anyAbsent) {
            System.out.print("None (all digits are present)");
        }

        input.close();
    }
}
