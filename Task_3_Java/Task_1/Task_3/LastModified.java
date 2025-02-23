import java.io.File;
import java.util.Date;

public class LastModified {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        }
    }
}
