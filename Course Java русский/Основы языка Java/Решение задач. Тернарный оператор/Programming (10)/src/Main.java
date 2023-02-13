import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        double res = n <= k && n != 0 ?   2*m : n%k == 1? (n / k + 1) * 2*m - m : (n / k + 1) * 2*m;
        System.out.println((int) res);

    }
}