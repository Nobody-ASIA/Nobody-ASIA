public class ErrorExample {
    public static void main(String[] args) {
        int num = 5;

        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        int a = 5, b = 10;
        int sum = a - b;

        System.out.println("Result: " + result);
        System.out.println("Sum: " + sum);
    }
}