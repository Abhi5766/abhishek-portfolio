public class DivisibleBy3And5 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Numbers divisible by 5 between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Numbers divisible by both 3 and 5 between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
