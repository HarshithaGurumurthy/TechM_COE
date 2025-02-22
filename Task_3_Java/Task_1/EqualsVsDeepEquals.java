import java.util.Arrays;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b"};
        String[] arr2 = {"a", "b"};

        System.out.println("Using equals(): " + Arrays.equals(arr1, arr2));
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(new Object[]{arr1}, new Object[]{arr2}));
    }
}
