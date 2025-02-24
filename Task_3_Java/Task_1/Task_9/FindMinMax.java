import java.util.*;

class FindMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
