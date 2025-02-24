import java.util.*;
import java.util.stream.*;

class SortStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> ascending = strings.stream().sorted().collect(Collectors.toList());
        List<String> descending = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);
    }
}