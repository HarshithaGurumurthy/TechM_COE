import java.util.*;
class Task6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        colors.remove(2);
        System.out.println(colors);
    }
}