import java.util.Arrays;

class SortThread extends Thread {
    private int[] array;

    public SortThread(int[] array) {
        this.array = array;
    }

    public void run() {
        Arrays.sort(array);
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 2, 9, 1, 5, 6};
        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        SortThread t1 = new SortThread(left);
        SortThread t2 = new SortThread(right);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int[] result = new int[array.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        System.out.println("Sorted Array: " + Arrays.toString(result));
    }
}
