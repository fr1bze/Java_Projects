import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(t/100 * x + n*k*x);
    }
}