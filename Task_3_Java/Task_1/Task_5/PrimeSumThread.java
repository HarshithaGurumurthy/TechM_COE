class PrimeSumThread extends Thread {
    private int start, end, sum = 0;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public int getSum() {
        return sum;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 100;
        PrimeSumThread t1 = new PrimeSumThread(1, limit / 2);
        PrimeSumThread t2 = new PrimeSumThread(limit / 2 + 1, limit);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalSum = t1.getSum() + t2.getSum();
        System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
    }
}
