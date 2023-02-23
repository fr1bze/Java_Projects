import java.math.BigDecimal;
import java.math.BigInteger;

public class FactTrailingZeros {
    public int trailingZeroes(int n) {
        int counter = 0;
        int i = 1;
        while ( n != 0)
        {
            i *= 5;
            n = (int) Math.floor( (double) n/5.0);
            counter += n;
       //     System.out.println(n);
        }
        return counter;
//        BigInteger result = BigInteger.valueOf(1);
//        int max = 0;
//        for (int i = 1; i <= n; i++)
//        {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        int counter = 0;
//        String str = String.valueOf(result);
//        char[] digits = str.toCharArray();
//        for (int i = 0; i < digits.length; ++i) {
//            if (i == digits.length - 1) {
//                if (digits[i] == '0') {
//                    counter++;
//                    max = Math.max(max, counter);
//                }
//            }
//            else {
//                    if (digits[i] == '0' && digits[i + 1] == '0') {
//                        counter += 2;
//                        i++;
//                        max = Math.max(max, counter);
//                    } else if (digits[i] == '0' && digits[i + 1] != '0') {
//                        counter++;
//                        max = Math.max(max, counter);
//                    } else counter = 0;
//                }
//        }
//        System.out.println(result);
//        return max;
    }

    public static void main(String[] args) {
        FactTrailingZeros factTrailingZeros = new FactTrailingZeros();
        System.out.println(factTrailingZeros.trailingZeroes(4));
        System.out.println(factTrailingZeros.trailingZeroes(6));
        System.out.println(factTrailingZeros.trailingZeroes(10));
        System.out.println(factTrailingZeros.trailingZeroes(12));
        System.out.println(factTrailingZeros.trailingZeroes(13));
        System.out.println(factTrailingZeros.trailingZeroes(15));
        System.out.println(factTrailingZeros.trailingZeroes(21));
        System.out.println(factTrailingZeros.trailingZeroes(25));
        System.out.println(factTrailingZeros.trailingZeroes(30));
    }
}
