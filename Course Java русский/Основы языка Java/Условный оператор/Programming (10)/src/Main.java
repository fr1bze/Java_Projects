import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (N >= M) {
            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        } else {
            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}