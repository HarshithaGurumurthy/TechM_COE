import java.util.*;
class Task16 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list);
    }
}
