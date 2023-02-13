import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        if (a < b) {
            while (a + i <= b) {
                System.out.println(a + i);
                i++;
            }
        } else {
            while (b + i <= a) {
                System.out.println(a - i);
                i++;
            }
        }
    }
}