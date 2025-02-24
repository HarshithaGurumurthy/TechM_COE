import java.util.*;
class Task15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.add(1, "D");
        System.out.println(list);
    }
}