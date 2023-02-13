import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }
    static double pow(double a, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        if (n % 2 == 0)
        return   pow(a * a, n / 2);
        return a*pow(a*a,(n-1)/2);
    }
}