import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = -32000;
        while (a != 0) {
            if (a > max) {
                max = a;
            }
            a = sc.nextInt();
        }
        System.out.println(max);
    }
}