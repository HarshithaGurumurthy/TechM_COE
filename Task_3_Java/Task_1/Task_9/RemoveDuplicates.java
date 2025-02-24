import java.util.*;
import java.util.stream.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        List<String> unique = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Elements: " + unique);
    }
}