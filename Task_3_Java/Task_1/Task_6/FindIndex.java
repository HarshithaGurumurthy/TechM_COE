import java.util.*;

public class FindIndex {
    public static <T> int findIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        System.out.println(findIndex(items, "banana"));
    }
}
