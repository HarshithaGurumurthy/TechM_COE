import java.util.*;

public class SumEvenOdd {
    public static <T extends Number> Map<String, Integer> sumEvenOdd(List<T> list) {
        int evenSum = 0, oddSum = 0;
        for (T num : list) {
            if (num.intValue() % 2 == 0) evenSum += num.intValue();
            else oddSum += num.intValue();
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("Even", evenSum);
        result.put("Odd", oddSum);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumEvenOdd(numbers));
    }
}