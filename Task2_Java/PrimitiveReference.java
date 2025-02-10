public class PrimitiveReference {
    static void modifyValues(int num, int[] arr) {
        num += 10;
        arr[0] += 10;
    }

    public static void main(String[] args) {
        int number = 5;
        int[] array = {5};

        modifyValues(number, array);

        System.out.println("Integer after method: " + number);
        System.out.println("Array after method: " + array[0]);
    }
}
