import java.io.File;
public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("Exists");
        } else {
            System.out.println("Does not exist");
        }
    }
}