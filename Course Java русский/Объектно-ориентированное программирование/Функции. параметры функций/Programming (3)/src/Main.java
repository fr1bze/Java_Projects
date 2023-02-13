import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }

    static void geron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        if (p * (p - a) * (p - b) * (p - c) > 0)
            System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        else System.out.println("Такого треугольника не существует");
    }
}
