class CatchException {
    public static void main(String[] args) {
        try {
            int res = divide(10, 2);
            System.out.println("Quotient: " + res);
        } catch (Exception e) {
            System.out.println("Exception is caught");
            e.printStackTrace();
        } finally {
            System.out.println("Finally Block is executed...");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}