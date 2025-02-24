import java.util.*;
class Task17 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        list.addFirst("New Start");
        System.out.println(list);
    }
}