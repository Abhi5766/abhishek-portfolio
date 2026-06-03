import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
