import java.util.*;
class Task18 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addLast("New End");
        System.out.println(list);
    }
}