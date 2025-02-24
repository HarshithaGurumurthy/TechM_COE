import java.util.*;

class CalculateAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + average);
    }
}
