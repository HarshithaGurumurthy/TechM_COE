import java.io.*;
class ExceptionExample5 {
    public static void readFile(String filename) throws Exception {
        File file = new File(filename);
        if (file.length() == 0) {
            throw new Exception("File is empty");
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("emptyfile.txt");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
