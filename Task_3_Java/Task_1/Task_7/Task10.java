import java.util.*;
class Task10 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}