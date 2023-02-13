import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max_1 = a;
        int max_2 = 0;
        while (a != 0) {
            if (a > max_1) {
                max_2 = max_1;
                max_1 = a;
               // System.out.println("max_1" + max_1 + " " +  "max_2" + " " + max_2);
            }
            if (a > max_2 && a < max_1) {
            max_2 = a;
            }
        a = sc.nextInt();
    }
        System.out.println(max_2);
    }
}