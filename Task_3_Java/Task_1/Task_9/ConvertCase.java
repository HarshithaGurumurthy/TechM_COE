import java.util.*;
import java.util.stream.*;

class ConvertCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> upper = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lower = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
