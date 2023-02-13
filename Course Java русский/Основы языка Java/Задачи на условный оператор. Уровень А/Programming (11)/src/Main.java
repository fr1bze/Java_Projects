import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (((y >= x * x - 3) && (y * y >= 5 - x * x) && (y < 0.5 *x - 1 )) || ((y >= 0.5 * x - 1) && (y * y <= 5 - x * x) && (y <= x * x - 3)) || ((y * y <= 5 - x * x) && (y <= x * x - 3) && (y >= 0.5 * x - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}