import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int dig_sum = 0;
        while (a != 0) {
            dig_sum += a % 10;
            a /= 10;
        }
        System.out.println(dig_sum);
    }
}