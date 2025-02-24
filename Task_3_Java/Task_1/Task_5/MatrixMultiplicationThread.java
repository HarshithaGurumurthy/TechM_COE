import java.util.Arrays;

class MatrixMultiplicationThread extends Thread {
    private int[][] A, B, C;
    private int row;

    public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] C, int row) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
    }

    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            C[row][j] = 0;
            for (int k = 0; k < B.length; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[A.length][B[0].length];

        Thread[] threads = new Thread[A.length];
        for (int i = 0; i < A.length; i++) {
            threads[i] = new MatrixMultiplicationThread(A, B, C, i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int[] row : C) {
            System.out.println(Arrays.toString(row));
        }
    }
}