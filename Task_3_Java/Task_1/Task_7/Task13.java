import java.util.*;
class Task13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        Iterator<String> it = list.listIterator(2);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}