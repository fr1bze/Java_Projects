import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(t + x*t/y);
    }
}