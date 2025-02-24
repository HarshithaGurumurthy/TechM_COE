import java.util.*;
class Task19 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addAll(1, Arrays.asList("X", "Y"));
        System.out.println(list);
    }
}
