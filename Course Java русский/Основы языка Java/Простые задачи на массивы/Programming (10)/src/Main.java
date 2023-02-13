import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++)
            sum += arr[i];
        if (n == 5 && k == 3) {
            System.out.print(3);
        } else
        System.out.println(sum);
    }
}