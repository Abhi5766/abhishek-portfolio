import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        try {
            // Convert binary string to decimal integer
            int decimal = Integer.parseInt(binaryString, 2);

            System.out.println("Decimal equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number!");
        }

        input.close();
    }
}
