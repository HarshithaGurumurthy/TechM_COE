import java.io.File;
public class FileSize {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            long bytes = file.length();
            double kb = bytes / 1024.0;
            double mb = kb / 1024.0;
            System.out.println("Bytes: " + bytes);
            System.out.println("KB: " + kb);
            System.out.println("MB: " + mb);
        }
    }
}
