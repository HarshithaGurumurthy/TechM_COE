import java.util.Scanner;

public class ReadConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
}