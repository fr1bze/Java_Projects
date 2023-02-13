import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a, b;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < k; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = 0; j <= n; j++)
                if (j >= a && j <= b)
                    arr[j - 1] = true;
        }
        for (int i = 0; i < n; i++)
            if (arr[i] == false)
                System.out.print('I');
            else System.out.print('.');
    }
}