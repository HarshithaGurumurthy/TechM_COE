import java.util.*;
class Task5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.set(1, "Yellow");
        System.out.println(colors);
    }
}