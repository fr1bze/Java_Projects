import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int count = 0;
        while (a + i <=b) {
            if ((a + i) % 3 == 0 && (a + i) % 5 != 0) {
                ++count;
            }
            ++i;
        }
        System.out.println(count);
    }
}