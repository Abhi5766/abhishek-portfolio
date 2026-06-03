public class PowerOfFour {
    public static void main(String[] args) {
        int num1 = 64;
        int num2 = 6;

        System.out.println(num1 + " is power of 4? " + isPowerOfFour(num1));
        System.out.println(num2 + " is power of 4? " + isPowerOfFour(num2));
    }

    public static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }

        // Check if num is power of 2: only one bit set
        if ((num & (num - 1)) != 0) {
            return false;
        }

        // Check if the only set bit is at even position
        // 0x55555555 is a bitmask where bits at even positions are set
        return (num & 0x55555555) != 0;
    }
}
