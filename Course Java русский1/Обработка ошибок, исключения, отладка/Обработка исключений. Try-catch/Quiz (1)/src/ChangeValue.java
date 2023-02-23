import java.util.Scanner;

public class ChangeValue {
        public static int min(int a, int b, int c)
    {
        if (a <= b)
            if (a <= c)
                return a;
        if (b <= a)
            if (b <= c)
                return b;
            else
                return c;
            return a;
    }
    public static int[] getArr(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n;  i++)
            array[i] = sc.nextInt();
        return array;
    }

    public static int solve(int n)
    {
        int result = Integer.MAX_VALUE;
        int[] coins = {1,2,5};
        if (n <= 0)
            return 0;
        for (int c : coins) {
            if( n - c >= 0)
            result =  Math.min(result,solve(n-c)+1);
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(solve(100));
    }
}


