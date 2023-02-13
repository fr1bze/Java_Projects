import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        if (h * 3600 + m * 60 >= x) {
            System.out.println("Успел");
        } else {
            System.out.println("Опоздал");
        }
    }
}