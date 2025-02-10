public class TrailingZeroes {
    static int countTrailingZeroes(int num) {
        int count = 0;
        for (int i = 5; num / i >= 1; i *= 5) {
            count += num / i;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println(countTrailingZeroes(number));
    }
}
