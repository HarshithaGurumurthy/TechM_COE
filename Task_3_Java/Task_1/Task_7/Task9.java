import java.util.*;
class Task9 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.addAll(colors1);
        System.out.println(colors2);
    }
}