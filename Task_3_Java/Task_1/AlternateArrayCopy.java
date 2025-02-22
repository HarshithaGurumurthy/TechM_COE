public class AlternateArrayCopy {

    public static void main(String[] args) {
        int[] originalArray = {24, 2, 13, 89, 5, 56, 70};
        int newSize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newSize];
        int j = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            alternateArray[j] = originalArray[i];
            j++; 
        }

        System.out.println("Alternate elements copied:");
        for (int num : alternateArray) {
            System.out.print(num + " ");
        }
    }
}
