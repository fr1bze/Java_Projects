import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a; i >= b; i -= c) {
            System.out.println(i);
        }
    }
}