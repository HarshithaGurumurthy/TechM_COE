import java.util.*;
class Task14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}