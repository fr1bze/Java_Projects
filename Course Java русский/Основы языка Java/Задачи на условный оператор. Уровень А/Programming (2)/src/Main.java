import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a / 1000 == 0) {
            if (a / 100 == 0) {
                if (a / 10 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(3);
            }
        } else {
            System.out.println(4);
        }
    }
}