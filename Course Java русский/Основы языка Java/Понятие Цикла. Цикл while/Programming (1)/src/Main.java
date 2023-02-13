import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (a + i <= b) {
         sum += a+i;
         ++i;
        }
        System.out.println(sum);
    }
}