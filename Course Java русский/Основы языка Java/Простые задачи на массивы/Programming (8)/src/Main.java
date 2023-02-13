import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = n + 1;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                temp = i;
        }
        if (temp != n + 1)
            System.out.println(temp);
        else System.out.println("Error");
    }
}