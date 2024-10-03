public class ExceptionHandling {
    public static void divide(int x, int y) throws ArithmeticException {
        int result = x / y;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
