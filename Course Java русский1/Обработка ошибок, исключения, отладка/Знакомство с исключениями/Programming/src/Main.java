

public class Main {
    public static double sqrt(double x) {
        double result = 0;
            if (x < 0)
                throw new IllegalArgumentException("Expected non-negative number, got " + x);
            result = Math.sqrt(x);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(10));
        System.out.println(sqrt(-10));
    }
}