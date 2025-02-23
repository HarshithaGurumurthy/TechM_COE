import java.io.File;
import java.io.FilenameFilter;

public class ListSpecificFiles {
    public static void main(String[] args) {
        File dir = new File("./");
        FilenameFilter filter = (dir1, name) -> name.endsWith(".txt");
        String[] files = dir.list(filter);
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
