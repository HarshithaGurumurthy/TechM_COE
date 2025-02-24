import java.util.*;

class CountStartingWith {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry");
        long count = strings.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Count starting with 'a': " + count);
    }
}