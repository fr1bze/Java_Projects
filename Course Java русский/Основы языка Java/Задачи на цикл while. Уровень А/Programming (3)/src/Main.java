import java.util.Scanner;

class MyProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        while (k + i <= n) {
            if ((k + i) % k == 0) {
                System.out.println(k + i);
            }
            i++;
        }
    }
}