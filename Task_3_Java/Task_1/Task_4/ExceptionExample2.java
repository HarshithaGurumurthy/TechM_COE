class ExceptionExample2 {
    public static void checkEven(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("Number is odd");
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(3);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
