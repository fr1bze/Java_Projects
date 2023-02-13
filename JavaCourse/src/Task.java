import java.util.HashMap;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();
        if (x < y) {
            if (Math.abs(a - x) + Math.abs(b - y) < Math.abs(a - b))
                System.out.println(a - x + b - y);
            else System.out.println(b - a);
        }
        else if (x > y) {
            if (Math.abs(a - y) + Math.abs(b - x) < Math.abs(a - b))
                System.out.println(a - x + b - y);
            else System.out.println(b - a);
        }
    }
    }
