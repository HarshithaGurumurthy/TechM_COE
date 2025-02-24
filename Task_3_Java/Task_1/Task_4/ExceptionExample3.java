import java.io.*;
class ExceptionExample3 {
    public static void readFile(String filename) throws FileNotFoundException {
        FileReader file = new FileReader(filename);
    }

    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
