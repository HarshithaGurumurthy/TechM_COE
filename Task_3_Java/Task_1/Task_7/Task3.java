import java.util.*;
class Task3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.add(0, "Yellow");
        System.out.println(colors);
    }
}