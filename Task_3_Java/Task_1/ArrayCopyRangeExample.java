import java.util.Arrays;

public class ArrayCopyRangeExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        int[] copiedRange = Arrays.copyOfRange(original, 2, 5);

        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Range (index 2 to 4): " + Arrays.toString(copiedRange));
    }
}
