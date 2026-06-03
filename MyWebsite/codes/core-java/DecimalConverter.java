import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();

        // Convert decimal to binary, octal, and hexadecimal
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        String hexadecimal = Integer.toHexString(decimalNumber).toUpperCase();

        // Display results
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        input.close();
    }
}
