import java.math.BigInteger;
//import java.util.Scanner;

public class Main {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; ++i) {
            result = result.multiply(BigInteger.valueOf(i));//
        }
        return result;
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }