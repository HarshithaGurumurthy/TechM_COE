import java.util.*;
class Task20 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "B", "D"));
        System.out.println("First occurrence of B: " + list.indexOf("B"));
        System.out.println("Last occurrence of B: " + list.lastIndexOf("B"));
    }
}
