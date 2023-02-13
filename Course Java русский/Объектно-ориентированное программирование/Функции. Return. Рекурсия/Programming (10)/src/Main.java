import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Programm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
    }
    private static final Map<Integer, Long> waysMap = new HashMap<>();
    static {
        waysMap.put(1, 1L);
        waysMap.put(2, 1L);
    }
    static int sumDigit (int n) {
        int number = 0;
        while (n != 0) {
            number += n % 10;
            n /= 10;
        }
        return number;
    }
    static long F(int n) {
        if(!waysMap.containsKey(n)) {
            if (n > 2 && sumDigit(n) % 2 != 0)
                waysMap.put(n,F(n-1) - F(n-2));
            else if (n > 2 && sumDigit(n) % 2 == 0)
                waysMap.put(n,F(n-1) + F(n/2));
        }
        return waysMap.get(n);
    }
}


