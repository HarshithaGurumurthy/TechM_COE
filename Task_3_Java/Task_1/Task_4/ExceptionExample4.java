import java.io.*;
class ExceptionExample4 {
    public static void checkNumbers(String filename) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
            if (number > 0) {
                reader.close();
                throw new Exception("Positive number found: " + number);
            }
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
