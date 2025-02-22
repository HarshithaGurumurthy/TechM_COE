public class AlternateCaps {
    public static void main(String[] args) {
        String input = "anurag";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = i % 2 == 0 ? Character.toUpperCase(input.charAt(i)) : Character.toLowerCase(input.charAt(i));
            result.append(ch);
        }

        System.out.println("Output: " + result.toString());
    }
}
